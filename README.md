# Toastie
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Toastie-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/7674) [![API](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=23) [![](https://jitpack.io/v/MrNtlu/Toastie.svg)](https://jitpack.io/#MrNtlu/Toastie)

## Getting Started
### Gradle
#### **Step 1.** Add the JitPack repository to your build file
Add it in your root `build.gradle` at the end of repositories:

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
#### **Step 2.** Add the dependency

```gradle
dependencies {
    implementation 'com.github.MrNtlu:Toastie:1.0.2'
}
```

### Maven
#### **Step 1.** Add the JitPack repository to your build file

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```
#### **Step 2.** Add the dependency

```xml
<dependency>
  <groupId>com.github.MrNtlu</groupId>
  <artifactId>Toastie</artifactId>
  <version>1.0.1</version>
</dependency>
```

## Usage

Warning Toast:

```Java
ToastieActivity.warningToast(MainActivity.this,"Warning Toast", Toast.LENGTH_LONG).show();
```
Success Toast:

```Java
ToastieActivity.successToast(MainActivity.this,"Success Toast",Toast.LENGTH_LONG).show();
```
Info Toast:

```Java
ToastieActivity.infoToast(MainActivity.this,"Info Toast.",Toast.LENGTH_LONG).show();
```
Error Toast:

```Java
ToastieActivity.errorToast(MainActivity.this,"Error Toast.",Toast.LENGTH_LONG).show();
```
Fully customizable toast, you can set the attributes that you need.
```Java
ToastActivity.makeAllCustomToast(MainActivity.this)
                        .setTypeFace(Typeface.DEFAULT_BOLD)
                        .setTextSize(16)
                        .setCardRadius(25)
                        .setCardElevation(10)
                        .setIcon(R.drawable.ic_error_black_24dp)
                        .setCardBackgroundColor(R.color.colorAccent)
                        .setMessage("Fully customizable toast. But in a different way.")
                        .setGravity(Gravity.CENTER,5,5)
                        .createToast(Toast.LENGTH_LONG)
                        .show();
```
Same as previous one but different way calling it.

```Java
ToastieActivity.makeAllCustomToast(MainActivity.this,"Fully custom toast. Ugly as ... :)",R.drawable.ic_info_black_36dp,
                        R.color.infoColor,cornerRadius,elevation,textSize,Typeface.SANS_SERIF,Gravity.TOP, xOffset,yOffset,Toast.LENGTH_LONG).show();
```

## Screenshots

<img src="https://raw.githubusercontent.com/MrNtlu/Toastie/master/art/Toastie.jpg">
