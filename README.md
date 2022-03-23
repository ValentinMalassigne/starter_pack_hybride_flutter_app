# How to set up hybride App

## General

    Soon

## For Android

Add these depedencies in the build.grade (Module level) file: 
```
    implementation "androidx.appcompat:appcompat:1.4.1"
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
```
Add the following buildFeatures after the buildTypes in the same file
```
    buildFeatures{
        viewBinding = true
    }
```
Add a custom style in style.xml with an AppCompat parent (see line 18 of the style.xml file of this project for an example) 
And use this style for your secondActivity (needs to be set in the Android Manifest)

Extend the Android Activity you create with AppCompatActivity

To close the Android Activity and go back to flutter you can press the back button or call the "finish()" function from your second Activity

## For iOS

    Soon