package com.whw.com.whw.InterfaceSec;
//违反
public class AntiISc {

    public static void main(String[] args) {
        C c = new C();
        c.depend123InA();

        D d = new D();
        d.depend145InB();
    }


}

interface NotSecInterface {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class A implements NotSecInterface {

    @Override
    public void operation1() {
        System.out.println("A implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("A implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("A implements operation3");
    }

    @Override
    public void operation4() {
        System.out.println("A implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("A implements operation5");
    }
}

class B implements NotSecInterface {

    @Override
    public void operation1() {
        System.out.println("B implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B implements operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B implements operation5");
    }
}

/**
 * C通过 接口 依赖A的123方法实现，导致A必须还得实现45冗余方法
 */
class C {
    private NotSecInterface notSecInterface = new A();
    public void depend123InA(){
        notSecInterface.operation1();
        notSecInterface.operation2();
        notSecInterface.operation3();
        System.out.println("----------------------------");
    }
}
/**
 * D通过 接口 依赖B的145方法实现，导致B必须还得实现23冗余方法
 */
class D {
    private NotSecInterface notSecInterface = new B();
    public void depend145InB(){
        notSecInterface.operation1();
        notSecInterface.operation4();
        notSecInterface.operation5();
        System.out.println("----------------------------");
    }
}
/**
 * 所以上面的方式，违反了接口隔离原则
 */
