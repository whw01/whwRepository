package com.whw.com.whw.dependencyInversion;

public class AntiDependencyInv {

    public static void main(String[] args) {
        Email email = new Email();
        Person person = new Person();
        person.receive(email);
    }
}
//依赖实体类，不能很好的扩展。
//不能接收微信，短信 等消息
class Person {
    public void receive(Email email){
        email.getInfo();
    }
}

class Email {
    public void getInfo(){
        System.out.println("电子邮件信息：hello world!");
    }
}
