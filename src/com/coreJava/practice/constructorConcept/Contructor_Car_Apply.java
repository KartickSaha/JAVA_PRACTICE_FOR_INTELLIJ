package com.coreJava.practice.constructorConcept;

public class Contructor_Car_Apply {

    Constructor_Car car = new Constructor_Car();

    public static void main(String[] args) {
        Constructor_Car car = new Constructor_Car();
        car.setMake("BMW");

        System.out.println("Result is : "+car.getMake());
        System.out.println("Gear is : "+car.gear);
        System.out.println("Speed is : "+car.speed);

        System.out.println("***********************************");

        Constructor_Car car2 = new Constructor_Car(2,35);
        System.out.println("Gear is : "+ car2.gear);
        System.out.println("Speed is : "+ car2.speed);






    }
}
