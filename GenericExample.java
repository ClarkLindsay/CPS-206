import java.util.*;

public class GenericExample {

   public static void main(String[] args) {
   
      ArrayList<String> list = new ArrayList<>();
      
      System.out.println(list.size());
      
      list.add("Clark");
      
      System.out.println(list.size());
      
      list.add(0, "Lindsay");
      
      System.out.println(list);
      
      System.out.println(list.contains("Kulis")); //F
      
      System.out.println(list.contains("Clark")); //t ? F
      
      String firstName = list.get(1);
   }
   
}
   