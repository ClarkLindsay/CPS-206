class SodaBottle extends Bottle{

   Soda soda;
   
   public SodaBottle(double capacity, Soda soda){
      super(capacity);
      this.soda = soda;
   }
   
   Soda getSoda(){
      return this.soda;
   }
   
   public String toString(){
      return this.soda.toString();
   }
}