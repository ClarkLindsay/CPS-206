import java.util.*;

public class Originator{
   private State state;
   private String message;
   
   private Caretaker caretaker = new Caretaker();
   
   public void setState(State state, String message){
      this.state = state;
      this.message = message;
   }
   
   public State getState(){
      return state;
   }
   
   public void save(){
      Message message = new Message(state);
      caretaker.add(message);
   }
   
   public Message getStateFromCaretaker(int i){
      return caretaker.get(i);
   }
}