import java.util.*;

public class SomeClass{

   public static void main(String[] args) throws Exception{  
      Originator originator = new Originator();
      originator.setState(State.DEBUG, "Minor setback");
      originator.save();
      originator.setState(State.TRACE, "Minorish setback");
      originator.save();
      originator.setState(State.INFO, "Normal Setback");
      originator.save();
      originator.setState(State.WARN, "Normalish Setback");
      originator.save();
      originator.setState(State.ERROR, "Major setback");
      originator.save();
      originator.setState(State.FATAL, "Majorish setback");
      originator.save();
      
      for(int i = 0; i <= 5; i++){
         System.out.println(originator.getStateFromCaretaker(i));
      }
   }
}