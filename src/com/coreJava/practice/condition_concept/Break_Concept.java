package com.coreJava.practice.condition_concept;

/* Break statement is user for to
come out of the loop instantly when condition met */

public class Break_Concept {
    public static void main(String[] args) {
        int number = 0;
        while(number<10){
            System.out.println("Value of number variable is :" + number);
            if (number == 6){
                break;
            }
            number ++;

        }
        System.out.println("Out Of While Loop because met the break statement condition");
    }
}
