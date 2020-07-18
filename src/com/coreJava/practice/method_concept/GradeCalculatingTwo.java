package com.coreJava.practice.method_concept;

public class GradeCalculatingTwo {

    //Create constructor for access non static method from main method.
   public static GradeCalculatingTwo gradeCal = new GradeCalculatingTwo();

    public static void main(String[] args) {
        String grade;

       grade = gradeCal.findGrade(90);
       gradeCal.displayGrade("Kona",grade);


        grade = gradeCal.findGrade(85);
        gradeCal.displayGrade("Kartick",grade);

        grade = gradeCal.findGrade(75);
        gradeCal.displayGrade("Prianka",grade);

    }

    // Using Return concept instead of void. so do that we have to declare
    // data type of the variable name and end of code write return and variable name.
    public String findGrade(int score){
        String grade;
        if(score>=90 && score <= 100){
            grade = "A";
        }
        else if
        (score>=80 && score <= 90){
            grade = "B";
        }
        else if
        (score>=70 && score <= 80){
            grade = "B";
        }
        else if
        (score>=60 && score <= 70){
            grade = "C";
        }
        else
        {
            grade = "D";
        }
        return grade;
    }

    public void displayGrade(String studentName, String grade){
        System.out.println("**********************************");

        System.out.println(" Grade Of "+ studentName + " is " + grade);

        System.out.println("**********************************");
    }
}
