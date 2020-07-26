package com.coreJava.practice.oopConcept;

public class CarEncaptulationConceptPartOne {

    // What is Encaptulation in Java?
 /* Encapsulation in Java is a mechanism of wrapping the data (variables)
    and code acting on the data (methods) together as a single unit.
    Declare the variables of a class as private.
    Provide public setter and getter methods to modify and view the variables values.*/


    // We can create manually also we can crete by the help of IDE.
    // Right click on the (private String color;) any where then go to generate click on that.
    // Then Select setter and getter. Now IDE Will create setterMethod and getterMethod for you.

    private String color;
    private String make;
    private String model;
    private int year;

    public static void increaseSpeed() {
        System.out.println("Increasing the speed");
    }
    //Creating SetterMethod to set the value of the variable. Here "make" is a variable.
    public void setMake(String make){
        this.make = make;
    }
    //Creating getterMethod to get the value of the variable from setter method.
    // Here "make" is a variable.
    public String getmake(){
        return make;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getmodel(){
        return model;
    }

  /*  public void setyear(int year){
        this.year = year;
    }*/
   /* public int getyear(){
        return this.year;
    }*/


    // Another way to set year which is more functional.
    public void setYearAnotherWay(int year){
        if (year > 1900){
            this.year = year;
        } else{
            System.out.println("This Year Is Not Valid");
        }
    }
    public int getyear(){
        return year;
    }




    public void setColor(String color){
        this.color = color;
    }
    public String getcolor(){
        return color;
    }

}
