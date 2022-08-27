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

















# 疑惑

## 类的初始化问题

### 问

 https://www.zhihu.com/question/268546130 。为什么  ChildClass.setX(int x) 会被调用？

```java

class ParentClass {
    private int parentX = 10;
    public ParentClass() {
        setX(100);
    }
    public void setX(int x) {
        parentX = x;
        System.out.println("ParentX 被赋值为 " + x);
    }
}
class ChildClass extends ParentClass{
    private int childX = 1;
    public ChildClass() {}
    @Override
    public void setX(int x) {
        childX = x;
        System.out.println("ChildX  被赋值为 " + x);
    }

    public void printX(){
        System.out.println("ChildX  的值是   " + childX);
    }
}

public class TryInitMain {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();
        childClass.printX();
    }
}
```

### 答

https://stackoverflow.com/questions/10244785/when-not-to-call-super-method-when-overriding 

https://stackoverflow.com/questions/13764238/why-invokespecial-is-needed-when-invokevirtual-exists

https://www.infoworld.com/article/2076949/how-the-java-virtual-machine-handles-method-invocation-and-return.html

https://www.zhihu.com/question/51920553/answer/128610039











