# GeneV4 docs（源文件）

对外文档站：**[https://ctoo-uxd.github.io/Android-GeneV4/](https://ctoo-uxd.github.io/Android-GeneV4/)**

正文 Markdown 在本目录；站点外观由仓库根目录 [`website/`](../website/)（VitePress）构建，经 GitHub Actions 发布。

本地预览：

```
cd website
npm install
npm run docs:dev
```


开启 Pages：仓库 **Settings → Pages → Source → GitHub Actions**（不要再用 “Deploy from a branch /docs”）。

组件页配图来自 Paparazzi（真 `com.genev4` 组件渲成 PNG），**不是**打开 catalog App 自动截屏。

```
gradlew.bat :catalog:recordPaparazziDebug
```

图在 `catalog/src/test/snapshots/images/`，并复制到 `website/public/components/`。外观变了先 record，再提交 PNG。CI 跑 `verifyPaparazziDebug`，对不上会失败。
