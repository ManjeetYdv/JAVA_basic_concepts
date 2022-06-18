package com.company;

import java.util.*;

public class OperatorInterface {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(3);
        vector.add(1);
        vector.add(5);
        vector.add(2);

        Collections.sort(vector);    //or       Collections.sort(vector , (a , b)->a-b);


        for(int i:vector){
            System.out.println(i);
        }
        //USING OPERATOR
        //USING LOGIC WHILE SORTING

        System.out.println("Increasing order ");
        Collections.sort(vector , (a, b)->a-b);          //will sort in increasing order
        //same -> Collections.sort(vector , (a , b)->a>b?1:-1);
        for(int i:vector){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Decreasing order : ");
        Collections.sort(vector , (a , b)->b-a);     //will sort in decreasing order

        for(int i:vector){
            System.out.print(i+" ");
        }

        Vector<Integer> list = new Vector<>();
        list.add(990);
        list.add(334);
        list.add(56);
        System.out.println();
        System.out.print("Sorted acc to last digit");
        Collections.sort(list , ( a ,  b)->a%10-b%10);
        System.out.println();
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();


        Vector<String> strList = new Vector<>();
        strList.add("Z");
        strList.add("YAC");
        strList.add("YB");
        strList.add("ABCD");

        System.out.println();
        System.out.println();
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(5);

        for(int i :set){
            System.out.println(i);
        }


        System.out.println("Strings in increasing order of length");
        Collections.sort(strList , (a ,b )->a.length()>b.length()?1:-1);
        //same as  Collections.sort(strList , (a ,b )->a.length()-b.length();

        for(String s:strList){
            System.out.print(s+" ");
        }

        System.out.println();
        System.out.println("Sorting string in alphabatical order(only acc to first character");

        Collections.sort(strList , (a , b)->a.charAt(0)-b.charAt(0));
        for(String s:strList){
            System.out.print(s+" ");
        }



        System.out.println("Treeset : ");
        Set<Integer> set2 = new TreeSet<>();
        set2.add(4);
        set2.add(3);
        set2.add(2);
        set2.add(2);



        for(int i: set2){
            System.out.print(i+" ");
        }
        System.out.println();


        Map<Integer , Integer> map = new HashMap<>();

        map.put(0 , 1);
        map.put(2 ,3 );
        map.put(2   ,4);

        System.out.println(map);

            Set <Integer> keys = map.keySet();

            for(int key :keys ){

                System.out.println(key + " : "+map.get(key));
            }












    }
}
