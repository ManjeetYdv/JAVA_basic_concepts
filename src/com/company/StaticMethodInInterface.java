package com.company;


interface y1{
    int x = 9 ;//by default final
    static void show(){
        System.out.println("showinng");
    }
}

public class StaticMethodInInterface {
    public static void main(String[] args) {
        y1.show();
        System.out.println(LeaveMeAlone.protectedMarks);




    }
}
