package com.company;


interface abc{
    void show();

}
public class LambdaExpression {
    public static void main(String[] args) {

        abc obj = new abc() {
            @Override
            public void show() {
                System.out.println("Functional Interface");
            }

        };
        obj.show();


       abc obj2 = ()-> System.out.println("functional interface using lambda expression");
       obj2.show();


       abc obj3 =()->{
           System.out.println("lambda expression");
           System.out.println("But multiple lines ");
       };

       obj3.show();
    }
}
