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
        System.out.println(this);
        System.out.println(super.equals(this));

    }
}


public class SuperIsThis {
    public static void main(String[] args) {
        new Subclass();
    }
}
