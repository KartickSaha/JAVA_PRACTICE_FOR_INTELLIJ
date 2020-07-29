package com.coreJava.practice.static_concept;



/*In Java, static is a keyword used to describe how objects are managed in memory.
It means that the static object belongs specifically to the class,
instead of instances of that class. Variables, methods, and nested classes
can be static Instead, we can make the variable static and make it part of the class itself.*/

public class Static_Concept_one {

   private String make;

/*When We make it static then it is part of the class instead of
  instance or object of the class. So, it can be used to refer to
  the common properties of all the object. Please see in next class.
  if we are not use static then instanceNumber always will be (0+1)=1;
  But when we use static then instanceNumber always will be (n(1)+1)= 2; */

   private static int instanceNumber =0;


   public Static_Concept_one(String make){
       this.make = make;
       instanceNumber++;
   }
   public String getMake(){
       return make;
   }
   public int getInstanceNumber(){
       return instanceNumber;
   }
}
