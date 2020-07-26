package com.coreJava.practice.condition_concept;
/* A. Use break statement to come out of the loop instantly.
B. Break also used in switch case control. Generally all cases
in switch case are followed by a break statement so that whenever
the program control jumps to a case, it doesn’t execute subsequent cases
As soon as a break is encountered in switch-case block, the control comes
out of the switch-case body.*/

public class Switch_Concept {

    public static void main(String[] args) {
        int totalNumberOfDays = numberOfDays(2000,2);
        System.out.println("Number Of Days in given year and month are :" + totalNumberOfDays);

    }

    public static int numberOfDays(int year, int month){
        //creating a  local variable
        int totalNumberOfDays = 0;

        switch (month){
            case 1 :
                totalNumberOfDays = 31;
                break;


            case 2 :
                if(year % 400 == 0){
                    totalNumberOfDays = 29;
                }
                else{
                    totalNumberOfDays = 28;
                }
                break;

            case 3 :
                totalNumberOfDays = 31;
                break;

            case 4:
                totalNumberOfDays = 30;
                break;

            case 5 :
                totalNumberOfDays = 31;
                break;

            case 6 :
                totalNumberOfDays = 30;
                break;

            case 7 :
                totalNumberOfDays = 31;
                break;

            case 8 :
                totalNumberOfDays = 31;
                break;

            case 9 :
                totalNumberOfDays = 30;
                break;

            case 10 :
                totalNumberOfDays = 31;
                break;

            case 11 :
                totalNumberOfDays = 30;
                break;

            case 12 :
                totalNumberOfDays = 31;
                break;

            default:
                System.out.println("Invalid Month");
                break;
        }


        return totalNumberOfDays;
    }
}
