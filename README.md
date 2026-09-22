# GeneV4

GeneV4 是一套 Android Jetpack Compose 组件库。包名：`com.genev4`。源码：[CTOO-UXD/Android-GeneV4](https://github.com/CTOO-UXD/Android-GeneV4)。

**文档站：** [https://ctoo-uxd.github.io/Android-GeneV4/](https://ctoo-uxd.github.io/Android-GeneV4/)（需在仓库 Settings → Pages 选择 `main` / `/docs` 后生效）

业务工程依赖 `:library` 模块即可使用 `Button`、`TextField`、`Scaffold`、`MaterialTheme` 等组件。

```kotlin
import com.genev4.Button
import com.genev4.MaterialTheme
import com.genev4.Text
```

## 项目结构

```
├── library/          组件库（对外发布）
│   └── src/
│       ├── commonMain/   组件、主题、设计 token
│       └── androidMain/  Android 专用实现与资源
├── catalog/          组件画廊 App，用来预览和验收
├── docs/             补充文档
├── scripts/          本机构建脚本
├── gradle/           依赖版本与 Gradle Wrapper
├── .jdk/             仓库自带 JDK 17（可选）
└── README.md
```

| 路径 | 作用 |
|---|---|
| `library/` | 组件实现。日常改组件、主题、资源都在这里。 |
| `catalog/` | 可安装的演示应用。底栏第一页是组件总览，后两页是用组件搭好的完整页面。 |
| `docs/` | 接入文档（快速开始、组件、主题）；维护者文档也在此。 |
| `scripts/` | `build.ps1` 等本机脚本。 |
| `gradle/` | `libs.versions.toml` 锁依赖版本。 |

`library/build/`、`catalog/build/`、`.gradle/`、`.kotlin/`、`.idea/` 是编译或 IDE 生成目录，不要手改。

## 模块

| 模块 | 说明 |
|---|---|
| `:library` | 发布用库。Maven 坐标：`io.github.ctoo-uxd:genev4` |
| `:catalog` | 画廊 App，applicationId：`com.genev4.catalog` |

## 环境

- JDK 17（仓库 `.jdk/` 可用；Android Studio 自带的较新 JBR 可能编不过）
- Android SDK，`compileSdk` / `targetSdk` 34，`minSdk` 21

## 构建

Windows：

```
gradlew.bat :library:assembleDebug
gradlew.bat :catalog:assembleDebug
```

或使用 `scripts/build.ps1`，会优先带上仓库内 JDK。

## 接入

完整说明见文档站：[https://ctoo-uxd.github.io/Android-GeneV4/](https://ctoo-uxd.github.io/Android-GeneV4/)（仓库内原文在 [docs/](docs/)）。

```kotlin
implementation("io.github.ctoo-uxd:genev4:0.1.0")
// 或本仓库：implementation(project(":library"))
```

主题入口为 `com.genev4.MaterialTheme`，不要和官方 `androidx.compose.material3.MaterialTheme` 混用。

维护者发版见 [docs/PUBLISH.md](docs/PUBLISH.md)。

## 许可证

Apache License 2.0。详见 [LICENSE](LICENSE) 与 [NOTICE](NOTICE)。
