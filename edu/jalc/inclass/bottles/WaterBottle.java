class WaterBottle extends Bottle{

   Water water;
   
   public WaterBottle(double capacity, Water water){
      super(capacity);
      this.water = water;
   }
   
   Water getWater(){
      return this.water;
   }
   
   public String toString(){
      return this.water.toString();
   }
}