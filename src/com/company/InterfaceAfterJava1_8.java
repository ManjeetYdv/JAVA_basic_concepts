package com.company;

@FunctionalInterface           //must have only 1 abstract method  , can have multiple default methods
interface abcd{
    void show();
    default public void watch(){
        System.out.println("Watching");
    }
    default public void chill(){
        System.out.println("chilling");
    }
}

class ThaeThae implements abcd{

    public void show(){
        System.out.println("Showing");
    }
    public void watch(){
        System.out.println("Overriding a default method");
    }
}
public class InterfaceAfterJava1_8 {

    public static void main(String[] args) {
//        abcd obj = new abcd() {
//            @Override
//            public void show() {
//                System.out.println("interface after java 1.8  can have default methods with implementation");
//            }
//        };
//
//        obj.chill();
//        obj.show();

        abcd obj = new ThaeThae();
        obj.show();
        obj.chill();
        obj.watch();

    }
}
