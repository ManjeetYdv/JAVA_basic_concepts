package com.company;

class Calculator{                     //Super   , Parent , base

    public Calculator(){
        System.out.println("Calculator");
    }
    public int add(int i , int j){
        return i+j;
    }
}

class CalcAdv extends Calculator{    //sub , child , derived

    public CalcAdv(){
        System.out.println("CalcAdv");
    }
    public int diff(int i , int j){
        return i-j;
    }

}

class CalcVeryAdv extends CalcAdv{

    public CalcVeryAdv(){
        System.out.println("CalcVeryAdv");
    }
    public int product(int i , int j){
        return i*j;
    }
}
public class Inheritance {

    public static void main(String[] args) {
//        CalcAdv obj = new CalcAdv();
//
//        System.out.println(obj.add(6 ,3));
//        System.out.println(obj.diff(6 , 3));

        CalcVeryAdv obj = new CalcVeryAdv();

        System.out.println(obj.add(6 ,3));
        System.out.println(obj.diff(6 , 3));
        System.out.println(obj.product(6 , 3));
    }
}
