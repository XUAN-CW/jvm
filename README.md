---
title: jvm
tags: 
date: 2022-06-06 00:17:45
id: 1654445865882236100
---
# 摘要

本项目为 [尚硅谷宋红康JVM全套教程](https://www.bilibili.com/video/BV1PJ411n7xZ) 的学习笔记

# 相关资料

| 类型    | 来源                           | 内容                                                         | 本项目中的路径 |
| ------- | ------------------------------ | ------------------------------------------------------------ | -------------- |
| PPT     | 评论区 UID 为 216026012 的用户 | [宋红康版JVM笔记.html](old\PPT\宋红康版JVM笔记.html)         | [PPT](PPT)     |
| git仓库 |                                | [学习Java虚拟机笔记](https://gitee.com/tcl192243051/studyJVM) |                |
|         |                                |                                                              |                |



# 常用工具

BinaryViewer | [下载页面](https://www.proxoft.com/BinaryViewer.aspx) | [BinaryViewerPortable.zip](https://www.proxoft.com/downloads/BinaryViewerPortable.zip) 

jclasslib | [IDEA中安装](assets\references\IDEA字节码学习查看神器jclasslib bytecode viewer.html) | [官方下载](https://github.com/ingokegel/jclasslib/releases) 



# 关于JDK

Oracle 可能会收费，所以我们研究 OpenJDK 

## 源代码

你可以按照 https://jdk.java.net/archive/ 的提示获取源代码，也可以通过 JDK 获取。我个人推荐通过 JDK 获取源代码，下面介绍通过 JDK 获取源代码的方式。

JDK 解压后，可以在解压的文件中找到一个名为 **src.zip** 的文件，这个文件就是 JDK 源代码。

1. JDK解压获取源代码。 **src.zip** 文件位置不同版本不太一样，JDK8解压的根目录下就有 **src.zip** ，而 JDK17 则是在解压目录下的 **lib/src.zip** 。
2. JAVA_HOME 获取源代码。如果你安装了JDK ，那你可以使用 `echo $JAVA_HOME` 查看 JAVA_HOME，到 JAVA_HOME 下获取 **src.zip** 文件。
3. 使用 docker 获取。

```sh
docker run --rm -itd --name openjdk-17.0.2 openjdk:17.0.2
# 进入 openjdk-17.0.2 运行 echo $JAVA_HOME 可知 /usr/java/openjdk-17/ 为 JAVA_HOME
# 从 JAVA_HOME 中复制 src.zip 到宿主机即可
docker cp  openjdk-17.0.2:/usr/java/openjdk-17/lib/src.zip openjdk-17.0.2-src.zip
docker stop openjdk-17.0.2
```











