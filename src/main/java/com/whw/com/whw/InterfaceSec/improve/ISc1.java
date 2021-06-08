package com.whw.com.whw.InterfaceSec.improve;
//将违反接口隔离原则的方式进行接口隔离改进
public class ISc1 {
    public static void main(String[] args) {
        C c = new C();
        c.depend1InA();
        c.depend23InA();
        D d = new D();
        d.depend1InB();
        d.depend45InB();
    }
}

/*    interface NotSecInterface {
        void operation1();
        void operation2();
        void operation3();
        void operation4();
        void operation5();
    }*/
//接口隔离拆分
interface SecInteface1 {
    void operation1();
}

interface SecInteface2 {
    void operation2();
    void operation3();
}

interface SecInteface3 {
    void operation4();
    void operation5();
}

class A implements SecInteface1,SecInteface2 {


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
}

class B implements SecInteface1,SecInteface3 {

    @Override
    public void operation1() {
        System.out.println("B implements operation1");
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

class C {

    public void depend1InA(){
        SecInteface1 secInteface1 = new A();
        secInteface1.operation1();
    }

    public void depend23InA(){
        SecInteface2 secInteface2 = new A();
        secInteface2.operation2();
        secInteface2.operation3();
    }
}

class D {
    public void depend1InB(){
        SecInteface1 secInteface1 = new B();
        secInteface1.operation1();
    }

    public void depend45InB(){
        SecInteface3 secInteface3 = new B();
        secInteface3.operation4();
        secInteface3.operation5();
    }
}
