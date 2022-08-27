---
title: classInit
tags: 
date: 2022-08-27 23:09:13
id: 1661612953056789800
---
# 摘要

## 问

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

## 答

https://stackoverflow.com/questions/10244785/when-not-to-call-super-method-when-overriding 

https://stackoverflow.com/questions/13764238/why-invokespecial-is-needed-when-invokevirtual-exists

https://www.infoworld.com/article/2076949/how-the-java-virtual-machine-handles-method-invocation-and-return.html

https://www.zhihu.com/question/51920553/answer/128610039

---

https://blog.csdn.net/topc2000/article/details/79454064
https://www.cnblogs.com/dolphin0520/p/3681042.html
https://blog.csdn.net/yb546822612/article/details/106210512

https://www.cnblogs.com/javastack/p/15441274.html

https://juejin.cn/post/6844903487432556551

https://cloud.tencent.com/developer/article/1622192







### 要点

```
使用-XX:hashCode=4来修改默认的hash方法实现。
```

- hashCode == 4
  此类方案返回当前对象的内存地址

```ini
if (hashCode == 4) {
     value = cast_from_oop<intptr_t>(obj) ;
  }
```
