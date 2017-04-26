public class SomeClass{

   public static void main(String[] args){
   
     Originator originator = new Originator();
     
     originator.setState("Start");
     System.out.println(originator.getState());
     originator.save();
     System.out.println(originator.getStateFromCaretaker(0)); 
   }
}