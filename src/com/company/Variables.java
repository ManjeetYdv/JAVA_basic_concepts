package com.company;
public class Variables {
    public static void main(String[] args) {

        byte a =5;
        short b= 5;
        int i =5;
        long l=5;
        long L =5000000000000l;

        double d =5.5;               //decimals are by default double so float use f;
        float f =5.5f;

        char c ='A';
        c++;                         //Increases ascii by 1
        char ch=54;                  //Ascii value
        System.out.println(ch);

        double dd =5 ;               //Implicit conversion
        double d1 =5.6;
        System.out.println(d1);
        int i1 = (int)d1;              //Type casting
        System.out.println(i1);



    }
}
