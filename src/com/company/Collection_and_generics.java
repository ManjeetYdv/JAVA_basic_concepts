package com.company;

import java.util.*;

public class Collection_and_generics {

    public static void main(String[] args) {

        int[] arr=  new int[3];

        Collection obj = new ArrayList();
        obj.add(1);
        obj.add("S");

        var obj1= obj;
        System.out.println(obj1);

        Collection<Integer> obj2 = new ArrayList<>();
        obj2.add(5);

        List<Integer> obj3 = new ArrayList<>();

        obj3.add(2);
        obj3.add(2);
        obj3.add(2);
        obj3.add(3 , 4);

        for(int i=0 ;i<obj3.size() ;i++){
            System.out.println(obj3.get(i));
        }

        Set<Integer> obj4 = new HashSet<>();         //No duplicates

        obj4.add(2);
        obj4.add(2);
        obj4.add(2);


     for(int i: obj4){
         System.out.println(i);
     }
        System.out.println("Treeset : ");
     Set<Integer> set = new TreeSet<>();
     set.add(4);
     set.add(3);
     set.add(2);
     set.add(2);



     for(int i: set){
         System.out.print(i+" ");
     }

     Vector<Integer> vector = new Vector<>();
        vector.add(116);
        vector.add(224);
        vector.add(22225);
        vector.add(1341);

        System.out.println();
        System.out.println();
       Collections.sort(vector , (a , b)->a%10-b%10);
      for(int i :vector){
      System.out.println(i);
  }

    }
}
