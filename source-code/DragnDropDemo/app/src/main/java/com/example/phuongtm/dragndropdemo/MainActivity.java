package com.example.phuongtm.dragndropdemo;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    private static final String TAG = "AppDebug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setTitle("Hello");
        setContentView(R.layout.activity_main);

        // Gets view
        TextView tvSource = (TextView) findViewById(R.id.tvSource);
        TextView tvDestination = (TextView) findViewById(R.id.tvDestination);

        // Sets Listener for TextView
        tvSource.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Log.d(TAG, "Long Click Detected. Ready for Drag and Drop");


                View.DragShadowBuilder myShadow = new View.DragShadowBuilder(v);

                // Create a new ClipData.Item
                ClipData.Item data = new ClipData.Item(((TextView)v).getText().toString());

                // Create list of mimeType
                String mimeType[] = {ClipDescription.MIMETYPE_TEXT_PLAIN};

                // Create a new ClipData include item
                ClipData clipData = new ClipData("transferData", mimeType, data);

                v.startDrag(clipData, myShadow, null, 0);

                return true;
            }
        });

        tvDestination.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                // Defines a variable to store the action type for the incoming event
                final int action = event.getAction();

                // Casts v to TextView
                TextView textView = (TextView) v;

                // Handles each of the expected events
                switch (action){

                    case DragEvent.ACTION_DRAG_STARTED:

                        Log.d(TAG, "Action drag started");

                        // Determines if this View can accept the dragged data
                        if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)){

                            // Changes text color if View can accept the dragged data
                            textView.setTextColor(Color.RED);

                            // Invalidate the view to force a re-draw
                            v.invalidate();

                            return true;
                        }

                        // Returns false if View cannot accept the dragged data
                        return false;

                    case DragEvent.ACTION_DRAG_ENTERED:

                        Log.d(TAG, "Action drag entered");

                        // Changes text color if View entered
                        textView.setTextColor(Color.GREEN);

                        // Invalidate the view to force a re-draw
                        v.invalidate();

                        return true;

                    case DragEvent.ACTION_DRAG_LOCATION:

                        Log.d(TAG, "Action drag location");

                        return true;

                    case DragEvent.ACTION_DRAG_EXITED:

                        Log.d(TAG, "Action drag exited");

                        // Changes text color to default
                        textView.setTextColor(Color.RED);

                        // Invalidate the view to force a re-draw
                        v.invalidate();

                        return true;

                    case DragEvent.ACTION_DROP:

                        Log.d(TAG, "Action drop");

                        // Extract data from ClipData
                        ClipData.Item item = event.getClipData().getItemAt(0);

                        // Get the text data from the item.
                        String dragData = item.getText().toString();

                        // Displays a message containing the dragged data.
                        Toast.makeText(getApplicationContext(), "Dragged data is " + dragData, Toast.LENGTH_LONG).show();

                        // Changes text color to default
                        clearTextView(textView);
                        textView.setText(dragData);

                        return true;

                    case DragEvent.ACTION_DRAG_ENDED:

                        Log.d(TAG, "Action drag ended");

                        // Clears text view
                        clearTextView(textView);

                        return true;

                    // An unknown action type was recieved.
                    default:
                        Log.e(TAG, "Unknow action type received by OnDragListener.");
                        break;
                }


                return false;
            }
        });
    }

    private void clearTextView(TextView v){
        v.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
