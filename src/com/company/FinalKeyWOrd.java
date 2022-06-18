package com.company;

class typeA{                              //Final variable
    final double PI =3.14;

    final int HIGHEST ;
    public typeA(){
        HIGHEST=100;
    }

}

final class TypeB{                       //Final class
     //No class can extend this
        }


 class Ran_A{

    public final void show(){         //THis method cant be overridden    , see theres an error in Ran_c while trying to override
        System.out.println("A");
    }
 }

 class Ran_C extends Ran_A{

  /*  public void show(){            //ERROR

    }*/
 }
public class FinalKeyWOrd {

    //Final keyword can be used with variables , method , class
}
