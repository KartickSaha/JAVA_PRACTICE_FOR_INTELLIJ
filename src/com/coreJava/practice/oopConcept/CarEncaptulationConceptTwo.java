package com.coreJava.practice.oopConcept;

public class CarEncaptulationConceptTwo {
    public static void main(String[] args) {
        // Here Create & Initialize the object.
        CarEncaptulationConceptPartOne bmw = new CarEncaptulationConceptPartOne();
        CarEncaptulationConceptPartOne mercedez = new CarEncaptulationConceptPartOne();



        bmw.setMake("BMW");
        bmw.setModel("X5");
        //bmw.setyear(2020);
        bmw.setYearAnotherWay(2000);
        bmw.setColor("White");

        System.out.println("My Car Made by "+ bmw.getmake());
        System.out.println("My Car Model is "+ bmw.getmodel());
        System.out.println("My Car year is "+ bmw.getyear());
        System.out.println("My Car color is "+ bmw.getcolor());

      mercedez.setMake("Mercedez Benz");
      mercedez.setModel("GLC 450");
      //mercedez.setyear(1800);
        // Here result showing zero because int default value is zero.
      //mercedez.setYearAnotherWay(1000);

        mercedez.setYearAnotherWay(2020);
      mercedez.setColor("Silver");



        System.out.println("My Car Made by "+ mercedez.getmake());
        System.out.println("My Car Model is "+ mercedez.getmodel());
        System.out.println("My Car year is "+ mercedez.getyear());
        System.out.println("My Car color is "+ mercedez.getcolor());


    }
}

