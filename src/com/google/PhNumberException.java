package com.google;

public class PhNumberException extends Exception{         //or extends Throwable

    public PhNumberException(){
        System.out.println("Phone number should be bw 1 to 10");
    }

    public PhNumberException(String str){
        super(str);
    }
}
