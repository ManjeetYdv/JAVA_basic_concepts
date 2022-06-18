package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

class Stud{
    int roll_no;
    int marks;
    String Name;

    public Stud(int roll_no , int marks   , String name){

        this.roll_no = roll_no;
        this.marks = marks;
        this.Name =  name;
    }

    public void display(){
        System.out.println("Roll Number -> "+roll_no+ " : Name-> "+Name+" : Marks -> "+marks);
    }
}
public class Colleections_ComparableInterface
{

    public static void main(String[] args) {

        List<Stud> students = new ArrayList<>();
        students.add(new Stud(1 , 56 , "Ankit"));
        students.add(new Stud(3 ,45  , "Rakesh"));
        students.add(new Stud(2 , 99   , "Manish"));




        System.out.println("Sorted according to marks");
        Collections.sort(students , (a , b )->a.marks-b.marks );
        for(Stud obj : students){
            obj.display();
        }


        System.out.println();
        System.out.println();



        Collections.sort(students , (a , b)->a.Name.charAt(0)-b.Name.charAt(0));
        for(Stud obj : students){
            obj.display();
        }



    }
}
