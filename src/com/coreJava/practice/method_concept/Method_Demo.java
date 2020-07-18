package com.coreJava.practice.method_concept;

import static com.sun.deploy.util.SystemUtils.getSimpleName;

public class Method_Demo {
    //One Way to call non static method from main method
    //public static Method_Demo method_demo = new Method_Demo();

    public static void main(String[] args) {
        methodOne();
        //Another Way to call non static method from main method by creating the object/
        // create and initialize the object of the class.
        Method_Demo method_demo = new Method_Demo();
        method_demo.methodTwo();
        method_demo.methodThree();
        method_demo.methodFour();
        int max = method_demo.getMaxValue(10,20);
        System.out.println("Max"+ max);

       int max1 = method_demo.getMaxValue(22,33);
        System.out.println("Max"+ max1);
        

    }

    public static void methodOne(){
        int i = 10;
        int j = 10;
        int k = i + j;
        System.out.println("Result of k is :" + k);
    }

    public  void methodTwo(){
        int i = 15;
        int j = 15;
        int k = i + j;
        System.out.println("Result of k is :" + k);
    }

    public  void methodThree(){
        int i = 15;
        int j = 15;
        int k = i * j;
        System.out.println("Result of k is :" + k);
    }
    // Here method type is not declaring void instead of we declare data type with return
    public int methodFour(){
        int i = 10;
        int j = 5;
        int k = i + j;
        System.out.println("Result of k is :" + k);
        return k;
    }

    public int getMaxValue(int a, int b){
        if(a>b){
            return a;

        }else {
            return b;
        }


    }





}
