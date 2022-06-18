package com.company;



class Student{

    int id;
    int Class;

  public void show(){
      System.out.println("id : "+ id);
      System.out.println("Class: "+Class);
  }

}
public class arrays {

    public static void main(String[] args) {

//
//        Student s1= new Student();
//        Student s2= new Student();
//        Student s3= new Student();
//        Student s4= new Student();
//        Student[]s={s1 , s2 , s3 ,s4};

        Student[] s = new Student[4];

        for(int i=0 ;i<s.length ;i++){          //here for each is giving error
           s[i] = new Student();
        }

        int i=0;
        for(Student x:s){

            x.id =Integer.parseInt("200005"+i++);
            x.Class= i+1;
         }
//        for(Student x:s){
//           x.show();
//        }

        //For-each loop

        int[] arr ={1 ,2 ,3, 4 };

        for(int k:arr){
            System.out.println(k);
        }

        int[][]arr2 ={{1 ,2  ,3} , {2 ,3 } , {5 , 6}};

        for(int a[] :arr2){
            for(int p:a){
                System.out.print(p+ " ");
            }
            System.out.println();
        }
    }

}
