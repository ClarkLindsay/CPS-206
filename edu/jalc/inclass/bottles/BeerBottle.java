class BeerBottle extends Bottle{

   Beer beer;
   
   public BeerBottle(double capacity, Beer beer){
      super(capacity);
      this.beer = beer;
   }
   
   Beer getBeer(){
      return this.beer;
   }
   
   public String toString(){
      return this.beer.toString();
   }
}