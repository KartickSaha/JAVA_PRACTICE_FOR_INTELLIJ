package com.coreJava.practice.condition_concept;

public class Conditional_Statement_One {
    public static void main(String[] args) {
        int score = 88;
        String grade = null;


        if(score>90){
            grade = "A";
            System.out.println("*****Successful*****");
        }
        else if (score>80){
            grade="B";
            System.out.println("*****Successful*****");

        }
        else if (score>70){
            grade ="c";
            System.out.println("*****Successful*****");
        }
        else if(score>60){
            grade= "D";
            System.out.println("*****Successful*****");
        }
        else if(score<50){
            grade = "F";
           System.out.println("Not Successful");

        }
        // If No condition met above then it will go to the next else statement and print out.
        else{

            System.out.println("*********Not Successful**********");

        }
        System.out.println("Score is :" + score);
        System.out.println("Grade is : " + grade);
    }

}
