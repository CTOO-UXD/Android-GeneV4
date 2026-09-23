# GeneV4 docs（源文件）

对外文档站：**[https://ctoo-uxd.github.io/Android-GeneV4/](https://ctoo-uxd.github.io/Android-GeneV4/)**

正文 Markdown 在本目录；站点为 [`website/`](../website/) 下的 **Lit + Material Web** 外壳（导航 / 按钮 / 列表等用 `@material/web`），组件效果仍用 Paparazzi 截图，经 GitHub Actions 发布。

本地预览：

```
cd website
npm install
npm run docs:dev
```

开启 Pages：仓库 **Settings → Pages → Source → GitHub Actions**。

```
gradlew.bat :catalog:recordPaparazziDebug
```

截图在 `catalog/src/test/snapshots/images/`，并复制到 `docs/public/components/`。
