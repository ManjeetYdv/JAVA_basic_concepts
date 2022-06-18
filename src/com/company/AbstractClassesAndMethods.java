package com.company;
abstract class Hooman{

    public abstract void eat();
    public abstract void walk();

}

class men extends Hooman{

    public void eat(){
        System.out.println("Men is eating");             //All abstracts methods must be implemented
    }
    public void walk(){
        System.out.println("Men is walking");
    }
}

class Women extends Hooman{

    public void eat(){
        System.out.println("Women is Eating");
    }
    public void walk(){
        System.out.println("Women is Walking");
    }
}
public class AbstractClassesAndMethods {

    public static void main(String[] args) {

        Hooman male = new men();                  //not a abstract concept  , you can create an parent ref with child object
        male.eat();

        Hooman female = new Women();
        female.eat();
    }
}
