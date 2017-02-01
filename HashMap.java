
import java.util.*;

public class HashMap <k,v> {

   public static void main(String[] args) {
   
      HashMap <Integer, String> numbers = new HashMap<>();     
   
      numbers.put(1, "one");
    
      numbers.get(1);
      
      HashMap <String, String> numbers2 = new HashMap<>();
      
      numbers2.put("one", "two");
      
      numbers.get("one");
          
   }
}