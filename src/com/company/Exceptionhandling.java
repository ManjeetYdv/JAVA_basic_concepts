package com.company;

public class Exceptionhandling {

    public static void main(String[] args) {

//        System.out.println("hello");
//        int i= 9/0;                                 //ERROR - exception
//        System.out.println("Bye");

        try{
            int[] a =new int[5];
            a[6] =2;
//            int i=9/0;
            int i=9/1;
            System.out.println("i is "+ i);


        }
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){      //Use like this if the both catch blocks doing sam thing
//            System.out.println("exception error");
//        }
        catch (ArithmeticException e){
            System.out.println("exception error");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit..." + e.getMessage());
        }
        catch(Exception e ){
            System.out.println("Something wrong");
        }
        finally {
            System.out.println("will be executed whether we have exception or not");
        }



    }
}
