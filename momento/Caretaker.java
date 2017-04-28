import java.util.*;
import java.util.stream.Collectors;

public class Caretaker{
   private ArrayList<Message> events = new ArrayList<>();
   
   protected Caretaker(){
      this.events = new ArrayList<>();
   }
   
   protected void add(Message message){
      events.add(message);
   }
   
   protected Message get(int i){
      return events.get(i);
   }
   
   ArrayList<Message> getAll(State context){
      ArrayList<Message> filtered = null;
      if(context == State.WARN){
         filtered =  (ArrayList<Message>) this.getWarnings();
      }
   
      return filtered;
   }

   
   private List<Message> getWarnings(){
      return events.parallelStream().filter((message) -> message instanceof Warn).collect(Collectors.toList()); 
   }
}