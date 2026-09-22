---
title: Migrate from Material3
nav_order: 5
permalink: /migrate/
---

# 从 Material3 迁移

接入与组件用法见 [快速开始]({% link getting-started.md %})、[组件索引]({% link components/index.md %})。

Phase 1 forks [androidx.compose.material3:material3-android:1.4.0](https://developer.android.com/jetpack/androidx/releases/compose-material3#1.4.0) with **the same composable and type names**. Only the Java/Kotlin package changes.

| Upstream | This library |
|---|---|
| Maven `androidx.compose.material3:material3:1.4.0` | `io.github.ctoo-uxd:genev4:0.1.0` (module `:library`) |
| `androidx.compose.material3.Button` | `com.genev4.Button` |
| `androidx.compose.material3.MaterialTheme` | `com.genev4.MaterialTheme` |
| `androidx.compose.material3.lightColorScheme` | `com.genev4.lightColorScheme` |
| `androidx.compose.material3.tokens` | `com.genev4.tokens` (still internal) |
| Android `R` / namespace `androidx.compose.material3` | `com.genev4` |

Do **not** rename `Button` to `GeneV4Button` in this phase. Business apps migrate by changing the import.

Do **not** mix this `MaterialTheme` with official `androidx.compose.material3.MaterialTheme` in the same composition. They use different CompositionLocals.

Experimental annotations (`@ExperimentalMaterial3Api`, `@ExperimentalMaterial3ExpressiveApi`) are kept as in 1.4.0.

KDoc `@sample androidx.compose.material3.samples.*` links still point at Google samples; those sample sources are not shipped here.
