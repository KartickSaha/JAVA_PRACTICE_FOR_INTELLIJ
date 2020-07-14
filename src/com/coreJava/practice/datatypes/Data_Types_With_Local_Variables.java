package com.coreJava.practice.datatypes;

public class Data_Types_With_Local_Variables {
    public static void main(String[] args) {

        //From byte to int variables default value is 0;
        //long variable default value is 0L / 0;
        //float variable default value is 0.0f;
        //double variable default value is 0.0d /0.0;
        // boolean variable value is false.
        //char variable default value is '\u0000';



        /*
         * Byte -- 8--bit
         * Min: -128
         * Max: 127
         * Default: 0
         */
        byte byteVariable = 127;
        System.out.println("Byte Variable : "+ byteVariable);

        /*
         * Short -- 16--bit
         * Min: -32,768
         * Max: 32,767
         * Default: 0
         * Default: 0
         */

        short shortVariable = 12700;
        System.out.println("Short Variable : "+ shortVariable);

        /*
         * int -- 32--bit
         * Min: -2,147,483,648
         * Max: 2,147,483,647
         * Default: 0
         */

        int intVariable = 1270000000;
        System.out.println("Int Variable : "+ intVariable);

        /*
         * long -- 64--bit
         * Min: -2^63
         * Max: 2^63 -1
         * Default: 0
         */

        long longVariable = 1270000000000000000L;
        System.out.println("Long Variable : "+ longVariable);

        /*
         * float -- 32-bit IEEE 754 floating point
         * Min: 231 − 1 = 2,147,483,647
         * Max: 2 − 2−23) × 2127 ≈ 3.4028235 × 1038
         * Default: 0
         */

        float floatVariable = 12789.99f;
        System.out.println("Float Variable : "+ floatVariable);

        /*
         * Double 64-bit IEEE 754 floating point---
         * Default: 0
         */

        double doubleVariable = 12789.99;
        System.out.println("Double Variable : "+ doubleVariable);

        /*
         * Boolean
         * Default: false
         */

        boolean booleanVariable = true;
        System.out.println("Boolean Variable : "+ booleanVariable);

        /*
         * char --16-bit Unicode character
         * Min: 0
         * Max: 65,535
         * Default: '\u0000'
         */

        char charVariable = 'G';
        System.out.println("Char Variable : "+ charVariable);
    }
}
