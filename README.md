# Circular Percentage View Composable Library (CircularValueView 💫🍕)

Simple composable library to showcase the value with circular percentage.

## Installation

Add the following dependency to your app's `build.gradle` file:

```gradle
implementation 'com.github.sandeepjak2007:jetcircularper:0.0.1'
```
Add the following dependency to your main `build.gradle` file:

```maingradle
 maven { url 'https://jitpack.io' }
```
Enable composable in app's `build.gradle` file for accessing composables in XMLs:
``app gradle
buildFeatures {
    compose true
}
``
## Implementation

**Kotlin File binded with XML:**
```kotlin View
binding.composeView.apply {
    //Dispose of the composition when the view's LifeCycleOwner id destroyed
    setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
    setContent {
        // JetCircular Percentage Composable call
        JetCircularPer(percentage = 0.8f, number = 200, color = Color.Blue)
    }
}
```
**XML Code:**
```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <androidx.compose.ui.platform.ComposeView
        android:id="@+id/compose_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</LinearLayout>
```
**ScreenShot:**

**KotlinFile:**

![CircularViewKotlinFile](https://github.com/sandeepjak2007/jetcircularper/assets/16497904/5a6422bc-e580-4760-b5a8-db84ca3925e6)

**XML File:**

![CircularViewXML](https://github.com/sandeepjak2007/jetcircularper/assets/16497904/fedf2083-ddf2-4825-9c01-ea8f424b42ff)

**Compose View:**
``` Compose View
JetcircularperTheme {
      Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colors.background
      ) {
          // JetCircular Percentage Composable call
          JetCircularPer(percentage = 0.8f, number = 200)
      }
  }
```
**ScreenShot:**
![CircularViewCompose](https://github.com/sandeepjak2007/jetcircularper/assets/16497904/8784efef-3f70-4de9-9659-6668af09af39)

## ScreenShots
![CircularView-1](https://github.com/sandeepjak2007/jetcircularper/assets/16497904/9065d8e8-3a66-4150-a456-4f1c7b26323b)
![CircularViewBlue](https://github.com/sandeepjak2007/jetcircularper/assets/16497904/b0131467-02df-4517-bfef-d6a70d097cbb)
![CircularView](https://github.com/sandeepjak2007/jetcircularper/assets/16497904/71f3ffea-f0ce-4f66-acfe-64005d7d228b)
