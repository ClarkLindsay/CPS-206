package edu.jalc.inclass.label;

public class DrPepperLogo {

   private final double height;

   private DrPepperLogo(){
      this.height = 8;
   }

   public DrPepperLogo(double height){
      this.height = height;
   }

   public double getHeight(){
      return this.height;
   }
}