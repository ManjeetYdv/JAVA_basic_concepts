package com.company;
class Hii implements Runnable{

    public void run(){
        for(int i=0 ;i<5 ;i++){
            System.out.println("hi");
            try{ Thread.sleep(500); } catch (Exception e){} //by default we have 1 thread i.e main so we dont need to extend thread class for this

        }
    }
}

class Hlo implements Runnable{

    public void run(){
        for(int i=0 ;i<5 ;i++){
            System.out.println("Hello");
            try{ Thread.sleep(500); } catch (Exception e){}//by default we have 1 thread i.e main so we dont need to extend thread class for this


        }
    }
}
public class MultiThreading_UsingRunnableInterface {


    public static void main(String[] args) {
        Hii obj1 = new Hii();
        Hlo ob2j = new Hlo();
        Runnable obj = new Hii();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(ob2j);

        t1.start();
        try{ Thread.sleep(10); } catch (Exception e){}   //so that if both collide at same time , obj1 thread occurs first and then obj2 after 10 miliseconds
        t2.start();

    }
}
