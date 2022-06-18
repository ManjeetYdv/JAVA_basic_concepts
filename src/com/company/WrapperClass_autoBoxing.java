package com.company;




public class WrapperClass_autoBoxing {

    public static void main(String[] args) {

        int i=5; //Primitive datatype
//
//        Integer ii = new Integer(5);  //Boxing  or Wrapping     and Integer is a wrapper class
//      //'Integer(int) and intValue()' is deprecated and marked for removal//
//        int j =  ii.intValue();            //Unboxing or unwrapping

        Integer value =7;                 //Autoboxing

        int res = value;                  //Autounboxing

        String str ="123";
        int st =Integer.parseInt(str);
        System.out.println(st);


    }
}
