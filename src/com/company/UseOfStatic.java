package com.company;
class Emp{
    int eid;
    int salary;
    static String CEO;

    static {                       //Executed when you load class (done once)
        CEO="Ramesh";
    }
    public Emp(){                //Executed when you create objects(done for all objects)
        eid =1;
        salary=1000;
//        CEO="Ramesh";                 //But constructor will be always called whenever a obj is created but we need to assign ceo only once..so dont use thhis
    }
    public void show(){
        System.out.println(eid +" : "+salary+" : "+CEO);
    }
}
public class UseOfStatic {

    public static void main(String[] args) {
        Emp e1 = new Emp();
//        e1.eid =1;
//        e1.salary=2000;
////      e1.CEO= "Ramesh";
//        Emp.CEO ="Ramesh";    //for static we don't need object


        Emp e2 = new Emp();
//        e2.eid=2;
//        e2.salary=3000;


        e1.show();
        e2.show();
    }
}
