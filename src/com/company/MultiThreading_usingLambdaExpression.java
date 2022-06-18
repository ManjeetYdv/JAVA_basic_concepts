package com.company;

public class MultiThreading_usingLambdaExpression {

    public static void main(String[] args) {

        Runnable obj = ()-> {                  //Runnable is a functional interface(with only run() method , so lambda expression can be uses
                                for(int i=0 ;i<5 ;i++){
                                System.out.println("Hii");
                                try{ Thread.sleep(500); } catch (Exception e){}//by default we have 1 thread i.e main so we dont need to extend thread class for this
                                     }
                             };


        Thread t1 = new Thread(obj);
        Thread t2 = new Thread( ()-> {
                                for(int i=0 ;i<5 ;i++){
                                System.out.println("Hello");
                                try{ Thread.sleep(500); } catch (Exception e){}//by default we have 1 thread i.e main so we dont need to extend thread class for this
            }
        });

        t1.start();
        try{Thread.sleep(10);}  catch(Exception e) { };
        t2.start();


    }


}
