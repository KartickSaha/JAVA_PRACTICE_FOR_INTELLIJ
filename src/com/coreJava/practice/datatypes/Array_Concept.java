package com.coreJava.practice.datatypes;

import java.sql.Array;
import java.util.Arrays;

public class Array_Concept {
    public static void main(String[] args) {

        // Declare int Array
        int[] arrayOne = new int[5];
        arrayOne[0] = 100;
        arrayOne[1] = 90;
        arrayOne[2] = 80;
        arrayOne[3] = 70;
        arrayOne[4] = 60;

        System.out.println("0 index : " + arrayOne[0]);
        System.out.println("1 index : " + arrayOne[1]);
        System.out.println("2 index : " + arrayOne[2]);
        System.out.println("3 index : " + arrayOne[3]);
        System.out.println("4 index : " + arrayOne[4]);

        // Size of Array
        int lengthOfArrayOne = arrayOne.length;

        //Best way to print out
        System.out.println("Length_Of_One :" + lengthOfArrayOne);
        for (int i = 0; i < lengthOfArrayOne; i++) {
            System.out.println("Print array element :" + arrayOne[i]);
        }

        //Apply sort method for reverse from java utils

        Arrays.sort(arrayOne);
        for (int i = 0; i < lengthOfArrayOne; i++) {
            System.out.println("Print array element :" + arrayOne[i]);
        }


        // Declare String Array
        String[] arrayTwo = new String[5];
        arrayTwo[0] = "Kartick";
        arrayTwo[1] = "Raj";
        arrayTwo[2] = "Ashik";
        arrayTwo[3] = "Arif";
        arrayTwo[4] = "Hassan";

        System.out.println("0 index : " + arrayTwo[0]);
        System.out.println("1 index : " + arrayTwo[1]);
        System.out.println("2 index : " + arrayTwo[2]);
        System.out.println("3 index : " + arrayTwo[3]);
        System.out.println("4 index : " + arrayTwo[4]);

        //Print out all of them in one line by appling toString() method
        System.out.println("Print Out Array Element In One Line :"+ Arrays.toString(arrayTwo));

        // Size of Array
        int lengthOfArrayTwo = arrayTwo.length;
        System.out.println("Length_Of_Two :" + lengthOfArrayOne);

        // Best Way to Print out
        for (int i =0; i<arrayTwo.length; i++) {
            System.out.println("Print array element    :  " + arrayTwo[i]);
        }
    }
}
