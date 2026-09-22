---
title: Components
nav_order: 3
has_children: true
permalink: /components/
---

# 组件

API 名称与 Material3 1.4.0 一致，包名为 `com.genev4`。下面按用途分组；每页含样式说明与可复制示例（无截图，样式以变体表 + 代码表达）。

先读 [快速开始]({% link getting-started.md %})，保证界面包在 `MaterialTheme` 内。

## Actions

| 组件 | 说明 |
|---|---|
| [Button]({% link components/button.md %}) | 填充 / 色调 / 描边 / 文字 / 抬升；含禁用 |
| IconButton / FAB | 见 catalog「图标按钮」「浮动按钮」；API 同 Material3 |

## Communication

| 组件 | 说明 |
|---|---|
| [Snackbar]({% link components/snackbar.md %}) | 底部短时反馈 |
| Badge | 角标；见 catalog「徽章」 |

## Containment

| 组件 | 说明 |
|---|---|
| [Card]({% link components/card.md %}) | 填充 / 抬升 / 描边卡片 |
| [Dialog]({% link components/dialog.md %}) | AlertDialog 等 |
| [Scaffold]({% link components/scaffold.md %}) | 页面骨架：顶栏、底栏、FAB、内容区 |

## Navigation

| 组件 | 说明 |
|---|---|
| [NavigationBar]({% link components/navigation-bar.md %}) | 底部导航 |
| NavigationRail / NavigationDrawer | 见 catalog「导航」 |

## Selection

| 组件 | 说明 |
|---|---|
| Checkbox / RadioButton / Switch / Slider | 见 catalog「选择」 |
| Chip / SegmentedButton | 见 catalog「纸片」「分段按钮」 |

## Text inputs

| 组件 | 说明 |
|---|---|
| [TextField]({% link components/text-field.md %}) | 填充 / 描边输入框；错误态 |

未单独成页的组件：用法与官方 Material3 相同，把 `androidx.compose.material3` 换成 `com.genev4`；真机对照跑 `:catalog`。
