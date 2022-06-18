package com.company;

import java.util.Collections;


class counter {
    int count;


    public synchronized void increment(){
        count++;
    }
}

public class Synchronized_demo {

    public static void main(String[] args) throws Exception {

        counter c = new counter();



        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for(int i=0 ;i<1000;i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                for(int i=0 ;i<1000;i++){
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("C counter : "+ c.count);
    }
}
