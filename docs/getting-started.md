# 快速开始

GeneV4 是 Android Jetpack Compose 组件库，Kotlin 包名为 `com.genev4`。

Maven 坐标：`io.github.ctoo-uxd:genev4:0.1.0`  
源码：[CTOO-UXD/Android-GeneV4](https://github.com/CTOO-UXD/Android-GeneV4)

## 1. 添加依赖

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.ctoo-uxd:genev4:0.1.0")
}
```

本仓库内联调试：

```kotlin
implementation(project(":library"))
```

要求：`minSdk` ≥ 21，工程已启用 Jetpack Compose。

## 2. 包一层 MaterialTheme

所有 GeneV4 组件必须放在 `com.genev4.MaterialTheme` 下。

```kotlin
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.genev4.Button
import com.genev4.MaterialTheme
import com.genev4.Text
import com.genev4.lightColorScheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(colorScheme = lightColorScheme()) {
                Button(onClick = { }) {
                    Text("确定")
                }
            }
        }
    }
}
```

暗色：

```kotlin
import com.genev4.darkColorScheme

MaterialTheme(colorScheme = darkColorScheme()) {
    // ...
}
```

更多主题说明见 [主题](/theming)。

## 3. Import

```kotlin
import com.genev4.Button
import com.genev4.MaterialTheme
import com.genev4.Scaffold
import com.genev4.Text
import com.genev4.TextField
```

## 4. 接下来

- 按需查看 [组件索引](/components/)
- 真机/模拟器跑 `:catalog` 看完整画廊
- 参数细节：IDE 悬停组件名，或打开 [源码目录](https://github.com/CTOO-UXD/Android-GeneV4/tree/main/library/src/commonMain/kotlin/com/genev4)
