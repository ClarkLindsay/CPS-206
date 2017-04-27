import java.util.*;

public class Caretaker{
   private List<Message> events;
   
   protected Caretaker(){
      this.events = new ArrayList<>();
   }
   
   protected void add(Message message){
      events.add(message);
   }
   
   protected Message get(int i){
      return events.get(i);
   }
}