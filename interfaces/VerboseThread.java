public class VerboseThread extends Thread{

   public void run(){
   
      try{
         Thread.sleep((int)(Math.random()*10000));
         System.out.println(this.getName() + " running");
      } 
      catch(Exception e){
         System.out.println(this.getName() + " interrupted");
      }
   }         
}