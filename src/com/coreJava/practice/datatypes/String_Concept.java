package com.coreJava.practice.datatypes;

public class String_Concept {
    public static void main(String[] args) {

        // String literal -- String constant pool---memory location
        // Here strOne is refference variable and Bangladesh is object
        // String is immutable
        String strOne = "Bangladesh is my mother land. I love my country";

        String strThree = "Bangladesh is my mother land. I love my country";
        // Here is not created a new object. Is refference to the new variable.

        //String object
        // Here strTwo is refference variable and Bangladesh is object
        String strTwo = new String("Bangladesh01");

        // Here is created a new object as well as created a new refference variable.
        String strFour = new String("Bangladesh01");

        String stringFive = strTwo + strFour;
        System.out.println("String concatenation is-----> "+ stringFive);
        System.out.println(stringFive.concat("  It is combination of strTwo + strFour"));


        System.out.println("CharAt Method returns the character " +
                "at the specified index--->" + strOne.charAt(3));

        System.out.println("ComparesTwo Method " +
                "strings lexicographically--->" + strOne.compareTo(strFour));

        System.out.println("Compares two strings lexicographically, " +
                "ignoring case differences ---->"+ strOne.compareToIgnoreCase(stringFive));

        System.out.println("Checks whether a string contains the exact same sequence" +
                " of characters of the specified CharSequence---->"
                +
                strOne.contentEquals(strThree));

        System.out.println("Checks whether a string is empty or not---->"
                + strOne.isEmpty());

        System.out.println("Returns the position of the last found " +
                "occurrence of specified characters in a string---->"
                + strOne.lastIndexOf('y'));

        /*String Indexing. The beginning character of a string corresponds to index 0
        and the last character corresponds to the index (length of string)-1 .
        The length of a string is the number of characters
        it contains, including spaces, punctuation, and control characters.
        That's why last index always -1 from length*/

        System.out.println("Returns the length of a specified string---->"
                + strOne.length());

        System.out.println("Checks whether a string starts with specified characters---->"
                + strOne.startsWith("B")); // Return boolean

        System.out.println("Converts a string to lower case letters---->"
                + strFour.toLowerCase());

        System.out.println("Converts a string to uper case letters---->"
                + strFour.toUpperCase());

        String strSix = "   Bangladesh     ";
        System.out.println("Removes whitespace from both ends of a string---->"
                + strSix.trim());

        String strSeven = "Bangladesh";
        System.out.println("To String---->"
                + strSeven); // not clear 100%
        System.out.println("Substring "+strSeven.substring(1,5));

        char[] charArray = strFour.toCharArray();
        for(int i =0; i<charArray.length; i++){
            System.out.println("Index "+ i +"is: " + charArray[i]);
        }









    }
}
