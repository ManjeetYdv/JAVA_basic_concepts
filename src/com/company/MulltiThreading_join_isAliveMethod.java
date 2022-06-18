package com.company;

public class MulltiThreading_join_isAliveMethod  {

    public static void main(String[] args) throws Exception{


        Thread t1 = new Thread(()->{
            for(int i=0 ;i<5 ;i++){
                System.out.println("Hi");
               try{ Thread.sleep(500);} catch (Exception e){}
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0 ;i<5 ;i++){
                System.out.println("Hello");
                 try{Thread.sleep(500);  } catch (Exception e){}                     //this is not main thread so exception must be handled explicitly
            }
        });

        t1.start();
        Thread.sleep(50);         //We are using main thread here and mian throws Exception  , so no need to explicitly use try and catch block
        t2.start();

      t1.join();
      t2.join();

        System.out.println("bye");
    }
}
