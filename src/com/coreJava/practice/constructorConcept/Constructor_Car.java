package com.coreJava.practice.constructorConcept;

public class Constructor_Car {

    //Implement Encaptulation Concept
    private String make;
    int gear;
    int speed;

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }



    /* public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }*/


    //Declaring Default Contructor or No Argument Constructor.
    public Constructor_Car(){
        this.gear=0;
        this.speed=0;
        //As soon as we create the object this printout will be executed first.
        System.out.println("Executing constructor without arguments");


    }
// Overloading Constructor by changing the arguments
    public Constructor_Car(int gear, int speed){
        this.gear=gear;
        this.speed=speed;
        //As soon as we create the object this printout will be executed first.
        System.out.println("Executing constructor with arguments");


    }
}
