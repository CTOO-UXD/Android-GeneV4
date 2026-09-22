# Phase 1 parity gate

First release is accepted only if all of the following hold.

## 1. Token diff

Tokens must match Material3 1.4.0 except the package declaration.

```powershell
powershell -NoProfile -File scripts/check-token-parity.ps1
```

or:

```
./gradlew :library:checkTokenParity
```

Golden copies live in `_upstream/sources/commonMain/androidx/compose/material3/tokens/`.

## 2. No official Material3 artifact

`:library` and `:catalog` Gradle configurations reject any `androidx.compose.material3:*` dependency. Compose UI / Foundation / Animation / material-ripple remain allowed.

Confirm with:

```
./gradlew :catalog:dependencies --configuration debugRuntimeClasspath
```

The tree must not contain `androidx.compose.material3:material3`.

AGP 8.5.2 + compileSdk 34 will warn that Compose 1.8 AARs want compileSdk 35. Phase 1 disables those AAR metadata tasks rather than changing tokens or components. Upgrade AGP/SDK later; do not “fix” this by depending on official Material3.

## 3. Catalog visual check

Install `:catalog` and walk every tab against the official [Compose Material Catalog](https://play.google.com/store/apps/details?id=androidx.compose.material3.catalog) (or the same components in an app that still uses M3 1.4.0).

Minimum states:

| Area | States |
|---|---|
| Buttons | enabled, disabled; filled / elevated / tonal / outlined / text |
| Chips | assist, filter selected/unselected, suggestion |
| Text fields | filled, outlined, error (`error` as input) |
| Checkbox / Switch / Radio | on, off, disabled |
| Slider / progress | mid value |
| Cards | filled, elevated, outlined |
| List / typography | default type scale |
| Navigation | NavigationBar, TabRow, TopAppBar |
| Theme | light and dark via the catalog switch |

Default `lightColorScheme()` / `darkColorScheme()` must be used. Do not introduce a brand palette until this baseline is signed off.

## 4. Dynamic color

On API 31+, `dynamicLightColorScheme` / `dynamicDarkColorScheme` remain available with the same names as M3. Not required for the first catalog screenshot pass.
