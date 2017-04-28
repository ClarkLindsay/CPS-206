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
   
   public void save() throws Exception{
      if(state == null || message == null) throw new Exception("State | Message cannot be null");
   
      Message message;
   
      if(state == State.DEBUG) message = new Debug(this.message);
      else if(state == State.TRACE) message = new Trace(this.message);
      else if(state == State.INFO) message = new Info(this.message);
      else if(state == State.WARN) message = new Warn(this.message);
      else if(state == State.ERROR) message = new Error(this.message);
      else message = new Fatal(this.message);
   
      caretaker.add(message);
   }
   
   public Message getStateFromCaretaker(int i){
      return caretaker.get(i);
   }
}