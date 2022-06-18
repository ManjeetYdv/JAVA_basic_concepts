package com.company;
class Hi extends Thread{

    public void run(){
        for(int i=0 ;i<5 ;i++){
            System.out.println("hi");
           try{ Thread.sleep(500); } catch (Exception e){} //by default we have 1 thread i.e main so we dont need to extend thread class for this

        }
    }
}

class Hello extends Thread{                //threads have a run method where you specify what to do , which is automatically called by start() method
 
    public void run(){
        for(int i=0 ;i<5 ;i++){
            System.out.println("Hello");
            try{ Thread.sleep(500); } catch (Exception e){}//by default we have 1 thread i.e main so we dont need to extend thread class for this


        }
    }
}
public class MultiThreading_UsingThreadClass {


    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello ob2j = new Hello();

        obj1.start();
        try{ Thread.sleep(10); } catch (Exception e){}   //so that if both collide at same time , obj1 thread occurs first and then obj2 after 10 miliseconds
        ob2j.start();

    }
}
