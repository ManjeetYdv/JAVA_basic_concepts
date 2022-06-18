package com.company;
class AAA{
    public void show(){
        System.out.println("AAA");
    }
}
class AA extends AAA {

    int i;
    public void show(){

        System.out.println("A") ;
        System.out.println(i);
    }
}

class BB extends AA{

    int i;
   @Override
    public void show()

    {  super.i=8;
        super.show();     //we calling show of parent(AA)
        System.out.println("B");
    }
}
public class Overriding  {
    public static void main(String[] args) {
       BB obj = new BB();
       obj.show();
    }

}
