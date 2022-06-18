package com.company;
class CasioC{

    public void add(int i ,int j){
        System.out.println(i+j);
    }
    public void add(int i , int j , int k){
        System.out.println(i+j +k);
    }
    public void add(double i , double j){
        System.out.println(i+j);
    }
}
public class MethodOverloading {


    public static void main(String[] args) {
        CasioC obj1 = new CasioC();
        obj1.add(1 , 2);
        obj1.add(1 ,2 ,3 );
        obj1.add(1.1 , 2.2);
    }


}
