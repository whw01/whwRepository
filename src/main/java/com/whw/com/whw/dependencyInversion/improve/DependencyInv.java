package com.whw.com.whw.dependencyInversion.improve;

public class DependencyInv {
    public static void main(String[] args) {
        Email email = new Email();
        WeiXin weiXin = new WeiXin();

        Person person = new Person();
        person.receive(email);
        person.receive(weiXin);
    }
}

interface IReceiver {
    public void getInfo();
}

class Email implements  IReceiver{

    @Override
    public void getInfo() {
        System.out.println("电子邮件信息！");
    }
}

class WeiXin implements IReceiver{

    @Override
    public void getInfo() {
        System.out.println("微信推送消息！");
    }
}

class Person {
    //依赖倒转，依赖接口
    public void receive(IReceiver receiver){
        receiver.getInfo();
    }
}

class Person2{
    private IReceiver receiver;
    //通过构造方法依赖倒转
    public Person2(IReceiver receiver){
        this.receiver = receiver;
    }

    public void receive(){
        receiver.getInfo();
    }
}
//通过setter的方法实现依赖倒转
interface IPerson {
    void setReceiver(IReceiver receiver);
    void receive();
}
class Person3 implements IPerson{
    private IReceiver receiver;

    @Override
    public void setReceiver(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void receive() {
        receiver.getInfo();
    }
}
