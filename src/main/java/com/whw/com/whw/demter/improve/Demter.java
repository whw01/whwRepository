package com.whw.com.whw.demter.improve;

public class Demter {
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.doMainMethod(new C());
    }
}
class MainClass {
    private A a = new A();
    public B doMainMethod(C c){
        a.doA();
        c.doC();
        return new B();
    }
}

class A {
    void doA(){
        System.out.println("A做一些事情");
    }
}

class B {
    void doB(){
        System.out.println("B做一些事情");
    }
}

class C {
    private D d;
    public C(){
        this.d=new D();
    }
    void doC(){
        d.doDforC();
        System.out.println("C做一些事情");
    }
}

class D {
    void doDforC() {
        System.out.println("D为C做一些事情，C才能做doC");
    }
}