package com.coreJava.practice.datatypes;

public class Default_Variables {
    /*Without decalred or assign any value of the variable
    is called Default Variable.*/
    /*When we declared a variable globally means in the class level is called global variable
    or class level variable.*/
    /*When we declared a variable in class level or
    globally with static keyword is called static variable.*/

    // Globally declared viriables but not assign any value to the variables.
    static byte byteVariables;
    static short shortVariables;
    static int intVariables;
    static long longVariables;
    static float floatVariables;
    static double doubleVariables;
    static boolean booleanVariables;
    static char charVariables;

    public static void main(String[] args) {
        System.out.println("ByteVariable Default Value " + byteVariables);
        System.out.println("ShortVariable Default Value " + shortVariables);
        System.out.println("IntVariable Default Value " + intVariables);
        System.out.println("LongVariable Default Value " + longVariables);
        System.out.println("FloatVariable Default Value " + floatVariables );
        System.out.println("DoubleVariable Default Value " + doubleVariables);
        System.out.println("BooleanVariable Default Value " + booleanVariables);
        System.out.println("CharVariable Default Value " + charVariables);

        globalByteMethod();
        globalShortMethod();
        globalIntMethod();
        globalLongMethod();
        globalFloatMethod();
        globalDoubleMethod();
        globalBooleanMethod();
        globalCharMethod();


    }

    // Here assign the value to the variables.
    public static void globalByteMethod(){
        byteVariables = 100;
        System.out.println("Globally declared byte Variable assigning here " + byteVariables);
    }

    public static void globalShortMethod(){
        shortVariables = 10000;
        System.out.println("Globally declared short Variable assigning here " + shortVariables);
    }

    public static void globalIntMethod(){
        intVariables = 1000000000;
        System.out.println("Globally declared int Variable assigning here " + intVariables);
    }

    public static void globalLongMethod(){
        longVariables = 1000000000000L;
        System.out.println("Globally declared long Variable assigning here " + longVariables);
    }

    public static void globalFloatMethod(){
        floatVariables = 100000.99f;
        System.out.println("Globally declared float Variable assigning here " + floatVariables);
    }

    public static void globalDoubleMethod(){
        doubleVariables = 10000000.99;
        System.out.println("Globally declared double Variable assigning here " + doubleVariables);
    }

    public static void globalBooleanMethod(){
        booleanVariables = true;
        System.out.println("Globally declared boolean Variable assigning here " + booleanVariables);
    }

    public static void globalCharMethod(){
        charVariables = 'G';
        System.out.println("Globally declared char Variable assigning here " + charVariables);
    }

}
