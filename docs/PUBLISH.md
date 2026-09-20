# 把 GeneV4 发给所有人用

任何人只要写下面这一行就能用，需要发到 **Maven Central**：

```kotlin
implementation("com.genev4:library:0.1.0")
```

GitHub Packages 默认要登录才能拉，不适合「所有人」。JitPack 更快，但不是 Android 默认仓库。

## 1. 准备公开仓库

把本工程推到 GitHub（或 Gitee 对外镜像），把 `gradle.properties` 里的 `POM_URL` / `POM_SCM_*` 改成真实地址。

## 2. 注册 Maven Central

1. 打开 [https://central.sonatype.com/](https://central.sonatype.com/) 注册。
2. 申请命名空间 **`com.genev4`**。
3. Central 会要求你证明拥有这个名字，一般是：
   - 域名 `genev4.com` 的 DNS TXT 记录，或
   - 对应 GitHub Organization。

没有 `genev4.com`、也控不了这个 GitHub org 时，**不能用 `com.genev4`**。改用 `io.github.你的用户名`，同时把库的 `group` / `coordinates` 改成同一套。

## 3. GPG 签名

Central 要求签名。本机生成密钥后，把私钥放到环境变量（不要写进仓库）：

```
ORG_GRADLE_PROJECT_signingInMemoryKey=<私钥 ASCII>
ORG_GRADLE_PROJECT_signingInMemoryKeyId=<短 ID>
ORG_GRADLE_PROJECT_signingInMemoryKeyPassword=<口令>
ORG_GRADLE_PROJECT_mavenCentralUsername=<Central 用户 Token>
ORG_GRADLE_PROJECT_mavenCentralPassword=<Central 用户 Token>
```

用户名/密码在 Central 网站 **Generate User Token** 得到。

## 4. 发布

先发到本机，确认坐标没写错：

```
gradlew.bat :library:publishToMavenLocal
```

业务工程加 `mavenLocal()` 后依赖 `com.genev4:library:0.1.0` 能编过即可。

再发 Central（必须已配置签名和 Token）：

```
gradlew.bat :library:publishToMavenCentral
```

到 [https://central.sonatype.com/](https://central.sonatype.com/) 里检查 Deployment，通过后约几十分钟同步到 `mavenCentral()`。之后任何人不用加额外仓库。

## 5. 接入方

```kotlin
repositories { mavenCentral() }
implementation("com.genev4:library:0.1.0")
```

不要再依赖 `androidx.compose.material3`。Compose 相关依赖会随本库透传。

版本号改 `gradle/libs.versions.toml` 的 `libraryVersion`。
