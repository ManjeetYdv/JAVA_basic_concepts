package com.company;

class Panzers{

    protected int i=4;
    public void show(){
        show1();
    }
    private void show1(){
        System.out.println("Joe");
    }
}
class ThugsTools extends Panzers{

    public void show(){
        System.out.println(i);
    }
}
class ChickMaget extends ThugsTools{
    int j=i;
    public void show(){
        System.out.println(i);
    }
}

class LeaveMeAlone{
    protected static int protectedMarks=2;
    public void show(){
//        System.out.println(i);   //can access i other than subsiding classes
    }
}
public class PrivateMethods {



    public static void main(String[] args) {
        Panzers obj = new Panzers();
        obj.show();
        System.out.println(obj.i);



    }
}
