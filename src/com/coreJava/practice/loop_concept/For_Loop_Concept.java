package com.coreJava.practice.loop_concept;

/*Loops are used to execute a set of statements repeatedly
until a particular condition is satisfied. */


/*Syntax Of For Loop

for(initialization(int i = 0); condition(i<10) ; increment/decrement(i++)
{
 printout statement(s);
}
*/

public class For_Loop_Concept {
    public static void main(String[] args) {

       for_loop_01();
       for_loop_02();
       for_loop_array_03();
       for_loop_array_04();

    }

    public static void for_loop_01(){
        for (int j = 0; j < 20; j++) {
            System.out.println("J value is :" + j);
        }
    }
    public static void for_loop_02(){
        //Reverse Counting
        for (int j = 20; j >= 0; j--) {
            System.out.println("J value is :" + j);
        }
    }

    public static void for_loop_array_03(){
        int arr[] = {2,4,6,8,10,12,14,16};
        for(int i = 0; i<arr.length; i++){
            System.out.println("Result of array :"+ arr[i]);
        }
    }
    public static  void for_loop_array_04(){
        String [] cars ={"Mercedez","BMW","Audi","Honda","Toyota"};
        for(String car:cars){
            System.out.println("Result Of Car Name is :"+ car);
        }
    }
}
