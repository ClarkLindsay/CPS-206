import java.util.*;

public class Caretaker{
   private List<Momento> events;
   
   protected Caretaker(){
      this.events = new ArrayList<>();
   }
   
   protected void add(Momento momento){
      events.add(momento);
   }
   
   protected Momento get(int i){
      return events.get(i);
   }
}