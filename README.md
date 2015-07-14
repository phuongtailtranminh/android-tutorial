# Android Tutorial 

This is quick start for android developer

# IDE

Android Studio is an official Android IDE supported by Google

Please be careful check out this requirement: http://developer.android.com/sdk/index.html#Requirements before download. Be sure that you meet the requirement.

Download: http://developer.android.com/sdk/index.html

Android Studio will ask you for install HAXM, you should install this for faster Android Emulator: [Intel Hardware Accesslerated Execution Manager](https://software.intel.com/en-us/android/articles/intel-hardware-accelerated-execution-manager)

You have to also check for install Android SDK on the first time install Android Studio

#### How to create an Android Virtual Device?

Firstly, you have to access AVD (Android Virtual Device) Manager **by the icon** on toolbar or **Tools -> Android -> AVD Manager**

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/AVD%20Manager%20Icon.png?raw=true "Android Virtual Device Manager Icon")

Next step we'll **Select a hardware** for AVD:

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/AVD%20Manager%20Select%20Hardware.png?raw=true "Android Virtual Device Select Hardware")

Then, we have to select a **System Image**; You have to download them if you don't have any system image on your machine.

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/AVD%20Manager%20Select%20Image.png?raw=true "Android Virtual Device Select System Image")

Last step is **Verify Configuration**, enter the name of new android device.

![alt text](https://github.com/phuongtailtranminh/android-tutorial/blob/master/images/AVD%20Manager%20Verify%20Config.png?raw=true "Android Virtual Device Verify Configuration")

Click **Show advanced settings" if you want edit this android device in more detail.

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