package com.company;

class Outer{                  //Outer.class
    int a ;

    public void display(){
        System.out.println("Outer class");
    }
    class inner{                      //Outer$inner.class
        public void display(){
            System.out.println("inner class");
        }
    }
}
public class InnerClass {                          //innerClass.class

    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();

        Outer.inner obj2 = obj.new inner();
        obj2.display();
    }
}
