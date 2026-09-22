# Upstream pin

This tree is a derivative of AndroidX Compose Material3 **1.4.0** (Android artifact).

| Item | Value |
|---|---|
| Group | `androidx.compose.material3` |
| Artifacts | `material3:1.4.0` (KMP umbrella), `material3-android:1.4.0` (sources + AAR used here) |
| Release notes | https://developer.android.com/jetpack/androidx/releases/compose-material3#1.4.0 |
| License | Apache License 2.0 |
| Source VCS | https://android.googlesource.com/platform/frameworks/support |
| POM runtime pins | foundation 1.8.1, ui 1.8.2, runtime 1.9.0, material-ripple 1.8.1, activity-compose 1.8.2, Kotlin stdlib 2.0.21 |

Re-download the pin:

```
https://dl.google.com/dl/android/maven2/androidx/compose/material3/material3-android/1.4.0/material3-android-1.4.0-sources.jar
https://dl.google.com/dl/android/maven2/androidx/compose/material3/material3-android/1.4.0/material3-android-1.4.0.aar
https://dl.google.com/dl/android/maven2/androidx/compose/material3/material3-android/1.4.0/material3-android-1.4.0.pom
```

Extracted Kotlin (unmodified packages) is stored under `_upstream/sources/` for token diffs. AAR resources were copied into `library/src/androidMain/res`.

Not forked in phase 1: `material3-window-size-class`, `material3-adaptive`, `material3-adaptive-navigation-suite`, XR.
