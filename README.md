# Toastie
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Toastie-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/7674) [![API](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=23) [![](https://jitpack.io/v/MrNtlu/Toastie.svg)](https://jitpack.io/#MrNtlu/Toastie)

## Getting Started
### Gradle
#### **Step 1.** Add the JitPack repository to your build file
Add it in your root `build.gradle` at the end of repositories:

**Note:** Please check above for the latest version!

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
    implementation 'com.github.MrNtlu:Toastie:latest.version'
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
  <version>latest.version</version>
</dependency>
```

## Usage

Warning Toast:

```Java
Toastie.warning(MainActivity.this,"Warning Toast", Toast.LENGTH_LONG).show();
Toastie.centerWarning(MainActivity.this,"Warning Toast", Toast.LENGTH_LONG).show();
Toastie.topWarning(MainActivity.this,"Warning Toast", Toast.LENGTH_LONG).show();
```
Success Toast:

```Java
Toastie.success(MainActivity.this,"Success Toast",Toast.LENGTH_LONG).show();
Toastie.centerSuccess(MainActivity.this,"Success Toast",Toast.LENGTH_LONG).show();
Toastie.topSuccess(MainActivity.this,"Success Toast",Toast.LENGTH_LONG).show();
```
Info Toast:

```Java
Toastie.info(MainActivity.this,"Info Toast.",Toast.LENGTH_LONG).show();
Toastie.centerInfo(MainActivity.this,"Info Toast.",Toast.LENGTH_LONG).show();
Toastie.topInfo(MainActivity.this,"Info Toast.",Toast.LENGTH_LONG).show();
```
Error Toast:

```Java
Toastie.error(MainActivity.this,"Error Toast.",Toast.LENGTH_LONG).show();
Toastie.centerError(MainActivity.this,"Error Toast.",Toast.LENGTH_LONG).show();
Toastie.topError(MainActivity.this,"Error Toast.",Toast.LENGTH_LONG).show();
```

Custom Toast:

```Java
Toastie.custom(MainActivity.this,"Custom Toast.",R.drawable.icon,R.color.background,Toast.LENGTH_LONG).show();
Toastie.centerCustom(MainActivity.this,"Custom Toast.",R.drawable.icon,R.color.background,Toast.LENGTH_LONG).show();
Toastie.topCustom(MainActivity.this,"Custom Toast.",R.drawable.icon,R.color.background,Toast.LENGTH_LONG).show();
```

Fully customizable toast, you can set the attributes that you need.
```Java
Toastie.allCustom(MainActivity.this)
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
Toastie.allCustom(MainActivity.this,"Fully custom toast. Ugly as ... :)",R.drawable.ic_info_black_36dp,
                        R.color.infoColor,cornerRadius,elevation,textSize,Typeface.SANS_SERIF,Gravity.TOP, xOffset,yOffset,Toast.LENGTH_LONG).show();
```

## Screenshots

<img src="https://raw.githubusercontent.com/MrNtlu/Toastie/master/art/Toastie.jpg">
