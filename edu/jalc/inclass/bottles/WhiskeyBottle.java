class WhiskeyBottle extends Bottle{
   
   private Whiskey whiskey;
   
   public WhiskeyBottle(double capacity, Whiskey whiskey){
      super(capacity);
      this.whiskey = whiskey;
   }
   
   public Whiskey getWhiskey(){
      return this.whiskey;
   }
}