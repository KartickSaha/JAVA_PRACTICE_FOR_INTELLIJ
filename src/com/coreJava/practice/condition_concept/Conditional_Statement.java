package com.coreJava.practice.condition_concept;

public class Conditional_Statement {
    public static void main(String[] args) {
        int valOne = 10;
        int valTwo = 20;
        if(valOne<valTwo){
            //If condition met true then go to print statement
            System.out.println("Condition met true");
        } else{
            //If condition met not true then go to print statement
            System.out.println("Condition met not true");
        }
       // Boolean default value is false.
        boolean v=  (valOne == valTwo);
        System.out.println("V is " + v);
    }
}
