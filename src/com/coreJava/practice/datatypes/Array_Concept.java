package com.coreJava.practice.datatypes;

public class Array_Concept {
    public static void main(String[] args) {
        int [] arrayOne = new int[5];
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


        String [] arrayTwo = new String[5];
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

    }
}
