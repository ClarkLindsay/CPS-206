public class Driver{
    
   public static void main(String[] args){
    
      Example example = new Example();
      Example example2 = new Example(() -> System.out.println("Injected doOptional")) ;
      
      example.doOptional();
      example2.doOptional();
      example.doMysterious(() -> System.out.println("Injected doOptional"));
   }
}