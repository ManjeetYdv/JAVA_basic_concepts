package com.company;


class Student10th{

    private int rollNum;
    private String name;

    public void setRollNum(int rollNum) {

        //Some code for login checks
        //System.out.println("Roll number changed");    //Advantages of getters and setters you can keep activity log  , can do login checks , etc;
        this.rollNum = rollNum;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class EncapsulationDemo {

    public static void main(String[] args) {
        Student10th s1 = new Student10th();
        s1.setRollNum(5);
        s1.setName("Rakesh");

        System.out.println(s1.getRollNum() +" | "+ s1.getName());
    }

}
