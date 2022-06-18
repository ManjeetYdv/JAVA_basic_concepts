package com.company;


class A_ran {
    public void show(){
        System.out.println("A_ran");
    }

}
public class AnonymousI_InnerClass {

    public static void main(String[] args) {

        A_ran obj = new A_ran(){
            public void show(){
                System.out.println("A_ran with 1 leg");

            }
           };


        obj.show();

    }
}
