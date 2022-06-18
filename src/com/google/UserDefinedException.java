package com.google;

import java.util.Scanner;

public class UserDefinedException {

    public static void main(String[] args) {

        int i=9;
        int j=10;
        try{
            int k = i/j;

            if(k==0){
                throw new Exception("k equals zero exception");
            }

        }
        catch (Exception e){
            System.out.println("error " + e.getMessage());
        }


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number bw 1 to 10");

        try{
            int k= sc.nextInt();

            if(k<1 || k>10){
                throw new PhNumberException("joe");
            }
        }
        catch (PhNumberException e){
            System.out.println("error: " + e.getMessage());
        }

    }
}
