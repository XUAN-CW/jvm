package learning.java.jvm.superisthis;

/**
 * @author 禤成伟
 * @date 2022-08-27 - 23:14
 */
class Superclass {
    Superclass(){
        System.out.println(this);
    }
}
class Subclass extends Superclass {
    public Subclass() {
        /**
         * 默认的hashcode和equals（直接使用的==比较）都是一样的，
         * 所以，这根本就在一个空间里，也不存在单独的出来的父类对象。
         */
        System.out.println(this);
        System.out.println(super.equals(this));

    }
}


public class SuperIsThis {
    public static void main(String[] args) {
        new Subclass();
    }
}
