# Android Tutorial 

This is quick start for android developer

# IDE

Android Studio is an official Android IDE supported by Google

> [Introduction to Android Studio video](https://www.youtube.com/watch?v=K2dodTXARqc&index=4&list=PLOU2XLYxmsILBTFkx5Fj_0TpUFKyZ1i7d)

> [Introduction to Gradle - Build System](https://www.youtube.com/watch?v=cD7NPxuuXYY&index=3&list=PLOU2XLYxmsILBTFkx5Fj_0TpUFKyZ1i7d)

> [Layout Editor in Android Studio](https://www.youtube.com/watch?v=JLLnhwtDoHw&index=2&list=PLOU2XLYxmsILBTFkx5Fj_0TpUFKyZ1i7d)

> [Debugging in Android Studio](https://www.youtube.com/watch?v=2I6fuD20qlY&index=1&list=PLOU2XLYxmsILBTFkx5Fj_0TpUFKyZ1i7d)

Please **be careful** check out [this requirement](http://developer.android.com/sdk/index.html#Requirements) before download. Be sure that you meet the requirement.

**Android Studio download link**: http://developer.android.com/sdk/index.html

Android Studio will ask you for install HAXM, you should install this for faster Android Emulator: [Intel Hardware Accesslerated Execution Manager](https://software.intel.com/en-us/android/articles/intel-hardware-accelerated-execution-manager)

You have to also check for install Android SDK on the first time install Android Studio

#### How to create an Android Virtual Device?

Firstly, you have to access AVD (Android Virtual Device) Manager **by the icon** on toolbar or **Tools -> Android -> AVD Manager**

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/AVD%20Manager%20Icon.png?raw=true "Android Virtual Device Manager Icon")

Next step we'll **Select a hardware** for AVD:

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/AVD%20Manager%20Select%20Hardware.png?raw=true "Android Virtual Device Select Hardware")

Then, we have to select a **System Image**; You have to download them if you don't have any system image on your machine.

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/AVD%20Manager%20Select%20Image.png?raw=true "Android Virtual Device Select System Image")

Last step is **Verify Configuration**, enter the name of new android virtual device.

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/AVD%20Manager%20Verify%20Config.png?raw=true "Android Virtual Device Verify Configuration")

Click **Show advanced settings** if you want edit this android device in more detail.

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/AVD%20Manager%20Advanced%20Settings.png?raw=true "Android Virtual Device Advanced Settings")

In advanced setting, you can edit your:

- AVD Name,
- Reselect AVD's Hardware
- Reselect AVD's System Image
- Startup size and orientation
- Camera
- Network
- Emulated Performance
- Memeroy and Storage
- Custom skin definition
- Keyboard

#### How to install new Android SDK?

You can access Android SDK Manager by click this icon on toolbar or **Tools -> Android -> SDK Manager**

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/Android%20SDK%20Manager%20Icon.png?raw=true "Android SDK Manager icon")

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/Android%20SDK%20Manager%20Window.png?raw=true "Android SDK Manager Window")

#### How to create new project?

From menu: File -> New -> New Project

#### Folder Structure of an Android App:

[Reference](https://developer.android.com/tools/projects/index.html#ApplicationModules)

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/Android%20App%20Folder%20Structure.png?raw=true "Folder Structure of an Android App")

- **app/java**: Contains Java source code for the app activities.

- **app/res/layout**: XML Files that are compiled into screen layouts (or part of a screen)

- **app/res/values**: For XML files tat define resources by XML element type. Unlike other resources in the res/ directory, resources written to XML files in this folder are not referneced by the file name. Instead, the XML element type controls how the resources defined within the XMl files are placed into the **R class**

- app/manifests/AndroidManifest.xml: The contorl file that describes the nature ofthe application and each of its components. For instance, it describes: certain qualities about the activities, services, intent receivers, and content providers; what permissions are requested; what external libraries are needed; what device features are required; what API Levels are supported or required; and others.

- Gradle Scripts: config for build system.

> The above with bold text is the most important which we'll work with it more frequently than other

#### activity_main.xml in detail

You can design your app in here with 2 options: 

- Text mode: using xml to create and edit components properties.

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/activity_main.xml_text_mode.png?raw=true "Text mode in app design")

- Design mode: using drag-drop to create and edit components attributes.

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/activity_main.xml_design_mode.png?raw=true "Design mode in app design")

# Doing some cool stuff

#### How to communicate between fragment and activity? [Reference](http://developer.android.com/guide/components/fragments.html#CommunicatingWithActivity)

> Fragment is a piece of an activity which enable more modular activity design. A fragment is a kind of sub-activity.

> An activity represents a single screen with a user interface just like window or frame of Java. Android activity is the subclass of ContextThemeWrapper class.

Specifically, the fragment can access the Activity instance with getActivity() and easily perform tasks such as find a view in the activity layout:

```java
View listView = getActivity().findViewById(R.id.list);
```

Likewise, your activity can call methods in the fragment by acquiring a reference to the Fragment from FragmentManager, using findFragmentById() or findFragmentByTag(). For example:

```java
ExampleFragment fragment = (ExampleFragment) getFragmentManager().findFragmentById(R.id.example_fragment);
```

# Android Architecture [more](https://en.wikipedia.org/wiki/Android_(operating_system)#Linux_kernel)

![alt text](https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Android-System-Architecture.svg/906px-Android-System-Architecture.svg.png "Layers and Architecture")


#### Applications

Application is the layer our app run on!


#### Application Framework: 

> Activity Manager − Controls all aspects of the application lifecycle and activity stack.

> Content Providers − Allows applications to publish and share data with other applications.

> Resource Manager − Provides access to non-code embedded resources such as strings, color settings and user interface layouts.

> Notifications Manager − Allows applications to display alerts and notifications to the user.

> View System − An extensible set of views used to create application user interfaces.

#### Libraries: [Reference](http://www.tutorialspoint.com/android/android_architecture.htm)

> android.app − Provides access to the application model and is the cornerstone of all Android applications.

> android.content − Facilitates content access, publishing and messaging between applications and application components.

> android.database − Used to access data published by content providers and includes SQLite database management classes.

> android.opengl − A Java interface to the OpenGL ES 3D graphics rendering API.

> android.os − Provides applications with access to standard operating system services including messages, system services and inter-process communication.

> android.text − Used to render and manipulate text on a device display.

> android.view − The fundamental building blocks of application user interfaces.

> android.widget − A rich collection of pre-built user interface components such as buttons, labels, list views, layout managers, radio buttons etc.

> android.webkit − A set of classes intended to allow web-browsing capabilities to be built into applications.


#### Android Runtime: 

Dalvik is a process virtual machine (VM) in Google's Android operating system that executes applications written for Android. [Reference](https://en.wikipedia.org/wiki/Dalvik_(software))

Programs are commonly written in Java and compiled to bytecode for the Java virtual machine, which is then translated to Dalvik bytecode and stored in .dex (Dalvik EXecutable) and .odex (Optimized Dalvik EXecutable) files; related terms odex and de-odex are associated with respective bytecode conversions. The compact Dalvik Executable format is designed for systems that are constrained in terms of memory and processor speed.

> Google made internal changes to the platform, with the Android Runtime (ART) officially replacing Dalvik for improved application performance, and with changes intended to improve and optimize battery usage, known internally as Project Volta [Reference](https://en.wikipedia.org/wiki/Android_version_history)

### Linux Kernel: 

Google's custom kernel based on Linux Kernel 3.4.0, [Reference](https://en.wikipedia.org/wiki/Android_version_history)