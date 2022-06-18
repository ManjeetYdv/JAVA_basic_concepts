package com.company;


class A {
    public A(){
        System.out.println("default A");
    }
    public A(int i){
        System.out.println("parameterized A");

    }

}


class B extends A{
    public B(){
        System.out.println("default B");
    }
    public B(int i){
        super(i);                            //without this default constructor of A will be called
        System.out.println("parameterized B");

    }

}


public class Super {

    public static void main(String[] args) {
        B obj = new B();

        System.out.println();
        System.out.println();

        B obj2 = new B(1);
    }
}
