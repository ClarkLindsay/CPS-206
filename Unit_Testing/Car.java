public class Car {

   public static void drive() {
      
   }
   
   public static void startCar() {
      
      CheckSourceOfIgnition();
      
      if (key) startKeyCar();
                      
      else startFobCar(); 
   }           
   
   public static void putSeatBeltOn() {
      grabSeatBelt();
      clickItOrTicket();
   }
   
   public static void putInGear() {
   
      if (manual) shiftManual();
      
      else shiftAuto();   
   }
   
   
   public static void shiftManual() {
      workClutch(true);
      moveGearShift();
      workClutch(false);
   }
      
   public static void workClutch(boolean press) {
   
      if (press)
         isClutchPress = true;
      
      else
         isClutchPress = false;
   }
   
   void testWorkClutch() {
      
      workClutch(true);
      assert(isClutchPressed());
      workClutch(false);
      assert(biscul());
      workClutch(true && false);
      assert(quantim());
   }
   
   public static void accelerate() {
   
   }
   
   public static void turn() {
   
   }
   
   public static void brake() {
   
   }

}