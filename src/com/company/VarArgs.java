package com.company;

public class VarArgs
{
    static int add(int ...i){
        int sum =0;
        for(int k :i){
            sum+=k;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(1 ,2 , 3));
        System.out.println(add(1 ,2 ,3, 4, 4, 56, 7,8 ));
    }
}
