# genev4-icons

Gene 4.0 **Standard** icon set as Compose `ImageVector`s.

Separate from `:library` (same split as Material Icons Extended vs Material3).

## Usage

```kotlin
implementation("io.github.ctoo-uxd:genev4-icons:0.2.0")
// 本仓库：implementation(project(":icons"))

Icon(
    imageVector = Icons.Filled.AccountCircle,
    contentDescription = "账号",
)
```

- `Icons.Filled.*` / `Icons.Outlined.*` ← Standard
- `Icons.AiFilled.*` / `Icons.AiOutlined.*` ← AI icon
- Names starting with a digit get an `Icon` prefix (`123` → `Icon123`)

## Regenerate from Figma

1. Export path batches into `icons/raw/batch_*.json` (agent / `use_figma`), **or** with a token:

```bat
set FIGMA_ACCESS_TOKEN=figd_...
C:\Users\86173\AppData\Local\Programs\Python\Python310\python.exe tools\generate-icons\parse_manifest.py
C:\Users\86173\AppData\Local\Programs\Python\Python310\python.exe tools\generate-icons\export_via_figma_api.py
```

2. Generate Kotlin:

```bat
C:\Users\86173\AppData\Local\Programs\Python\Python310\python.exe tools\generate-icons\generate_icons.py
```

3. Compile:

```bat
gradlew.bat :icons:compileDebugKotlinAndroid
```
