package com.whw.com.whw;

public class InnerClass {

    private InnerClass(){

    }

    private static class MyInnerClass{
        static {
            System.out.println("内部类加载");
        }
        private static final InnerClass innerClass = new InnerClass();
    }

    static {
        System.out.println("主类加载");
    }

    public static InnerClass getInstance(){
        return MyInnerClass.innerClass;
    }

    public static void aaa(){

    }

    public static void main(String[] args) {
        InnerClass.getInstance();
    }
}
