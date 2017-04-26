import java.util.*;

public class Originator{
   private String state;
   
   private Caretaker caretaker = new Caretaker();
   
   public void setState(String state){
      this.state = state;
   }
   
   public String getState(){
      return state;
   }
   
   public void save(){
      Momento momento = new Momento(state);
      caretaker.add(momento);
   }
   
   public Momento getStateFromCaretaker(int i){
      return caretaker.get(i);
   }
}