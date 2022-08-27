package learning.java.jvm.classinit;

/**
 * @author 禤成伟
 * @date 2022-08-27 - 23:11
 */
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

public class ClassInit {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();
        childClass.printX();
    }
}
