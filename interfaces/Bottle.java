public class Bottle implements Pourable, Fillable{

   public Bottle(Pourable p){}
   //public Bottle(Fillable f){}

   public void pour(){}
   public void fill(){}
   
   public static void main(String[] args){
      //Bottle bottle = new Bottle();
      new Bottle(()-> System.out.println("pouring")).pour();
   }
  
   //Bottle bottle = 
      //new Bottle(){
         //public void pour(){}
         //public void fill(){}
      //};
      
   
}