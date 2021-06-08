package com.whw.com.whw.openAndClose;

public class AntiOpenAndClose {

    public static void main(String[] args) {
        Draw draw = new Draw();

        Sheep sheep = new Sheep();

        Dog dog = new Dog();

        draw.startDraw(sheep);

        draw.startDraw(dog);
    }
}

class Graph {
    int type;
}
//提供方
class Sheep extends Graph{

    Sheep(){
        super.type=1;
    }

}

class Dog extends Graph{
    Dog(){
        super.type = 2;
    }

}

//使用方

//如果再想画一个其他的东西就必须修改使用方，违反了开闭原则
class Draw{

    public void startDraw(Graph graph){
        if(graph.type==1){
            drawSheep();
        }else if(graph.type==2){
            drawDog();
        }
    }
    public void drawSheep(){
        System.out.println("画一只羊");
    }
    public void drawDog(){
        System.out.println("画一条狗");
    }
}
