package com.company;
class Parent {
    public void show(){
        System.out.println("Parent");
    }
}

class Child extends Parent{

    public void show(){
        System.out.println("Child");
    }

    public void config(){
        System.out.println("Config");
    }
}

class Child2 extends Parent{

    public void show(){
        System.out.println("Child 2");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

//        Child obj1 = new Parent(); // error


        Parent obj = new Child(); //Runtime Polymorphism
        obj.show();
//        obj.congig(); //error  , method must be present in parent

        obj = new Child2();  //Dynamic Method Dispatch
        obj.show();

    }


}
