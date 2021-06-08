package com.whw.com.whw.openAndClose.improve;

public class OpenAndClose {

    public static void main(String[] args) {
        Sheep sheep = new Sheep();

        Dog dog = new Dog();

        Draw draw = new Draw();

        draw.startDraw(sheep);
        draw.startDraw(dog);

        Chicken chicken = new Chicken();
        draw.startDraw(chicken);


    }
}

abstract class Graph {
    int type;

    public abstract void drawGraph();
}

//提供方
//改进：提供方重写抽象类方法，如果需要画其他的物件只需要扩展提供方，而不用修改使用方，符合开闭原则
class Sheep extends Graph {

    Sheep() {
        super.type = 1;
    }

    @Override
    public void drawGraph() {
        System.out.println("画一只羊");
    }
}

class Dog extends Graph {
    Dog(){
        super.type = 2;
    }

    @Override
    public void drawGraph() {
        System.out.println("画一条狗");
    }
}

//扩展一只鸡出来
class Chicken extends Graph{
    Chicken(){
        super.type = 3;
    }

    @Override
    public void drawGraph() {
        System.out.println("画一只鸡");
    }
}

//使用方
//改进
class Draw{

    public void startDraw(Graph graph){
        graph.drawGraph();
    }
}

