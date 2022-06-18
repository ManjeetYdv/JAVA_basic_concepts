package com.company;

public class SelectionDemo {

    public static void main(String[] args) {

//        if else statments

        int i=0;
        if(i==0){
            System.out.println("i is zero");
        }
        else if(i>0){
            System.out.println("i is positive");
        }
        else {
            System.out.println(" i is negative");
        }

//        Switch statments

        int n=100;

        switch (n) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("greater than 5");

        }

    }
}
