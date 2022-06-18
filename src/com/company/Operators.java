package com.company;

public class Operators
{
    public static void main(String[] args) {
        /*
        Arithmetic -> +  , - , * , / , %
        BitWise
        Relational -> == , != , >=  . <= , >  , <
        Logical -> || , && , !
        Ternary Operator -> xyz=  condition?exp1:exp2
     */

        int m=5;
        int n=3;
        System.out.println(m+"  , "+n);

//        ++n    //Pre increment
//        n++     //Post increment

        m=++n;   // m will be 4;
//        m=n++;   // m will be 3

        System.out.println(m+"  , "+n);


        int j=5;

        String jStr = j%2==0 ?"Even":"Odd";
        System.out.println(jStr);

    }



}
