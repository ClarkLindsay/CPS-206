// Proves ArrayLists are not meant for 2D

import java.util.*;

public class TwoDArray {

   public static void main(String[] args) {
   
   ArrayList <ArrayList<String>> list = new ArrayList<>();
   
   list.add(new ArrayList<>());
   
   list.size();
   
   list.get(0);
   
   ArrayList<String> listZero = list.get(0);
   
   listZero.size();
   
   }
}