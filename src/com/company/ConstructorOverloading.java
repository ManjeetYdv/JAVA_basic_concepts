package com.company;
class Calc{
    int num1;
    int num2;
    int result;

    public Calc(){
        num1 =5;
        num2 =10;

    }

    public Calc(int k){
       num1 =k;

    }

    public Calc(double d , int k){
        num1 =(int) d;
        num2 =k;
    }

    public Calc(int num1 , int num2){                         //Use of this
        this.num1=num1;
        this.num2=num2;
    }
   public void perform(){
       result = num1+num2;
   }
   public int multiply(int x , int y){
       return x*y;
   }


}
public class ConstructorOverloading{

    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.num1=4;
        obj.num2=5;
        obj.perform();
        int result = obj.result;
        System.out.println(result);
        System.out.println(obj.multiply(5 , 6));

        Calc obj2 = new Calc();
        System.out.println(obj2.num1 + obj2.num2);

        Calc obj3 = new Calc(5);
        System.out.println(obj3.num1*obj2.num1);

        Calc obj4 = new Calc(5.5 , 6) ;
        System.out.println(obj4.num1 + obj4.num2);

        Calc obj5 = new Calc(7 ,8 );
        System.out.println(obj5.num1+obj5.num2);
    }
}
