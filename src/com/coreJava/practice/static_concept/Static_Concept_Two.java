package com.coreJava.practice.static_concept;

public class Static_Concept_Two {
    public static void main(String[] args) {

        Static_Concept_one sc1 = new Static_Concept_one("Benz");
        System.out.println("Car is make by " + sc1.getMake());
        System.out.println("Instance Number is " + sc1.getInstanceNumber());


        Static_Concept_one sc2 = new Static_Concept_one("BMW");
        System.out.println("Car is make by " + sc2.getMake());
        System.out.println("Instance Number is " + sc2.getInstanceNumber());
    }
}
