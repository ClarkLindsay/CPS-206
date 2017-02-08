package edu.jalc.inclass.bottle;

/*
A bottle class
*/

class SodaBottle {
   
   private double capacity = 20.0;
   
   private SodaBottle() {
      setCapacity(0);
   }
   
   SodaBottle(double capacity) {
      setCapacity(capacity);
   }
   
   void setCapacity(double capacity) {
      this.capacity = capacity;
   }
}