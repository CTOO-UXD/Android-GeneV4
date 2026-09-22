---
title: Publish
nav_exclude: true
---

# 把 GeneV4 发给所有人用

仓库：[CTOO-UXD/Android-GeneV4](https://github.com/CTOO-UXD/Android-GeneV4)

没有 `genev4.com` 时，Maven 坐标用 GitHub 组织命名空间：

```kotlin
implementation("io.github.ctoo-uxd:genev4:0.1.0")
```

Kotlin 包名仍是 `com.genev4`，只有 Maven `groupId` 改成 `io.github.ctoo-uxd`。

## 1. 在 Central 验证命名空间

1. 打开 [Namespaces](https://central.sonatype.com/publishing/namespaces)。
2. `com.genev4` 可以不管，会一直 Pending。
3. **Add Namespace**，填 `io.github.ctoo-uxd`。
4. 页面会要你在 GitHub 建一个临时仓库（名字是一串验证码）。到 [CTOO-UXD](https://github.com/CTOO-UXD) 建同名空仓库，公开即可。
5. 回到 Central 点 **Verify Namespace**。变成 Verified 后再发布。

若登录账号不是组织所有者，验证会失败，需要有权限在 `CTOO-UXD` 下建仓库的人操作。也可以改用你个人 GitHub 用户名：`io.github.你的用户名`（告诉我后改工程坐标）。

## 2. 生成 Token

[User Token](https://central.sonatype.com/usertoken) → **Generate User Token**，保存 username / password。

## 3. GPG 签名

```
gpg --full-generate-key
gpg --list-secret-keys --keyid-format LONG
gpg --export-secret-keys --armor <密钥ID>
```

不要写进仓库。Windows 上优先写用户级 `C:\Users\<你>\.gradle\gradle.properties`（Gradle daemon 经常读不到后来才设的环境变量；`setx` 还会把超长私钥截断到 1024 字符）：

```
mavenCentralUsername=<Token username>
mavenCentralPassword=<Token password>
signingInMemoryKey=<私钥 ASCII，换行写成 \n>
signingInMemoryKeyId=<8 位密钥 ID>
signingInMemoryKeyPassword=<GPG 口令>
```

改完环境变量或这份文件后先执行 `gradlew.bat --stop`，再发布。

## 4. 发布

```
gradlew.bat :library:publishToMavenLocal
gradlew.bat :library:publishToMavenCentral
```

到 [Publish](https://central.sonatype.com/publishing) 里确认 Deployment，通过后点 Publish。

## 5. 接入方

```kotlin
repositories { mavenCentral() }
implementation("io.github.ctoo-uxd:genev4:0.1.0")
```

## 6. 以后更新（不能覆盖旧版本）

Maven Central 上 `0.1.0` 一旦 PUBLISHED 就永久存在，改代码后必须升版本。

1. 改 `gradle/libs.versions.toml` 里的 `libraryVersion`，例如 `0.1.0` → `0.1.1`（修 bug）或 `0.2.0`（有行为变化）。
2. README / 本文档里的坐标版本一并改掉。
3. 先本地验证：`gradlew.bat :library:publishToMavenLocal`
4. 再上传：`gradlew.bat :library:publishToMavenCentral`
5. 到 [Deployments](https://central.sonatype.com/publishing/deployments) 等 VALIDATED，点 Publish。等变成 PUBLISHED、`repo1.maven.org` 上能打开该版本，别人才拉得到。

不要对同一个版本再跑一遍发布。Token 和 GPG 仍用本机用户环境变量或 `~/.gradle/gradle.properties`，不要写进仓库。
