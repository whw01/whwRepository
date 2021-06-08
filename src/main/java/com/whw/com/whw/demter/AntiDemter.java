package com.whw.com.whw.demter;

public class AntiDemter {
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.doMainMethod(new C());
    }
}

class MainClass {
    private A a = new A();

    public B doMainMethod(C c){
        a.doA();
        //D不是直接依赖类，可以提到C当中去，减少依赖类对被依赖类的可知。
        D d = new D();
        d.doDforC();
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
    void doC(){
        System.out.println("C做一些事情");
    }
}

class D {
    void doDforC(){
        System.out.println("D为C做一些事情，C才能做doC");
    }
}