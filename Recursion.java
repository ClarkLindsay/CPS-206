public class Recursion {
   
   public static void main(String[] args) {
   
      Recursion recursion = new Recursion();
      
      int input = Integer.parseInt(args[0]);
      
      System.out.println("Sum = " + recursion.sum(input));
      
      System.out.println("Factorial = " + recursion.doFactorial(input));
         
   }
   
   public int doFactorial(int n) {
   
      if (n == 1)
         return 1;
   
      return doFactorial (n - 1) * n;         
   }
   
   public int sum(int n) {
   
      if (n == 1)
         return 1;
   
      return sum (n - 1) + n;        
   }  
}

