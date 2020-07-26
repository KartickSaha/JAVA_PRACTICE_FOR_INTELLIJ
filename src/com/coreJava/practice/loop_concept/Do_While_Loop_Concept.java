package com.coreJava.practice.loop_concept;

/* Syntax Of Do While Loop
do { statement printout (s)
}
while(condition)*/

/*do-while loop condition is evaluated after the execution of loop’s body.*/

public class Do_While_Loop_Concept {
    public static void main(String[] args) {
     Do_While_Loop_Concept dw01 = new Do_While_Loop_Concept();
     Do_While_Loop_Concept dw02 = new Do_While_Loop_Concept();

     dw01.doWhileLoop_01();
     dw02.doWhileLoop_02();


    }
    public void doWhileLoop_01(){
        int i = 0;
        do {
            System.out.println("I Value Is  :  " +i);
            i++;
        }
        while (i < 20);

    }

    public void doWhileLoop_02() {
        int arr[] = {2, 4, 6, 8, 10};
        int i = 0;
        do {
            System.out.println("print the result of array  :" + arr[i]);
            i++;
        }
        while ( i<5 );
    }
}

