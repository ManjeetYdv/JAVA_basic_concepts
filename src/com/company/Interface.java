package com.company;

//abstract class  Writer {
//    public abstract void show();
//}

interface Writer{
    public  abstract void show();

}
class Stationary {

}



class Pencil extends Stationary  implements Writer{

    public void show(){
        System.out.println("i'm a pencil");
    }

}

class Pen implements  Writer{

    public void show(){
        System.out.println("i'm a pen");
    }
}

class Kit{

    public void doSomething(Writer p){
        p.show();
    }

}
public class Interface {

    public static void main(String[] args) {
        Writer pen = new Pen();
        Writer pencil=  new Pencil();

        Kit kit = new Kit();
        kit.doSomething(pen);
        kit.doSomething(pencil);

    }
}
