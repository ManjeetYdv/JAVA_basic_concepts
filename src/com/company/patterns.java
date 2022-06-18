package com.company;

public class patterns {


    public static void main(String[] args) {

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        for(int i=0 ;i<5 ;i++){
            for(int j=0 ;j<i+1 ;j++){
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }

        System.out.println();


//        A
//        A B
//        A B C
//        A B C D
//        A B C D E

        for(int i=0 ;i<5 ;i++){
            char ch='A';
            for(int j=0 ;j<i+1;j++ ){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();



//        $ $ $ $
//        $     $
//        $     $
//        $ $ $ $
        for(int i=0 ;i<4 ;i++){
            for(int j=0 ;j<4 ;j++){
                if(i==0 || i==3){
                    System.out.print('$' +" ");
                }
                else {
                    if(j==0 || j==3){
                        System.out.print('$'+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

        for(int i=1 ;i<=10 ;i++){

            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println();
        System.out.println();

        int count=0;
        for(int i=1 ;i<100 ;i++){

            if(count==5){
                break;
            }
           else if(i%2==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println();
        System.out.println();

        int[][] arr={{1 , 2} , {3 ,4 } , {5 , 6}};
        for(int[] i :arr){
            System.out.print(i[0] +" "+ i[1]);
            System.out.println();
        }
    }
}
