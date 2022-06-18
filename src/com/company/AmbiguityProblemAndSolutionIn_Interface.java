package com.company;

interface x1{

    void show();
    default public void tell(){
        System.out.println("Telling x1");
    }
}

interface x2{
    void show();
    default public void tell(){
        System.out.println("Telling x2");
    }

}
class child implements x1 , x2{

    @Override
    public void show() {
        System.out.println("Showing x1");
    }

    @Override
    public void tell() {
        x1.super.tell();
        x2.super.tell();
    }
}
public class AmbiguityProblemAndSolutionIn_Interface {

    public static void main(String[] args) {

        child obj = new child();
        obj.show();
        obj.tell();
    }
}
