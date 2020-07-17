package com.coreJava.practice.method_concept;

public class GradeCalculatingOne {

    // crate constructor for access non static method from main method.
    public static GradeCalculatingOne gradeCal = new GradeCalculatingOne();

    public static void main(String[] args) {
        gradeCal.findGrades("Kona", 90);
        gradeCal.findGrades("Kartick", 80);
        gradeCal.findGrades("Prianka",70);


    }
    public void findGrades(String student_Name, int score){
        String grade;
        if(score>=90 && score<=100){
            grade = "A";
        }
        else if(score>=80 && score<=90){
            grade = "B";
        }
        else if(score>=70 && score <=80){
            grade = "C";
        }
        else if(score>=60 && score<=70){
            grade = "D";
        }
        else {
            grade = "F";
        }
        System.out.println("Grade Of " + student_Name + " is :" + grade);
    }
}
