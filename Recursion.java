public class Recursion {

   public static void main(String[] args) {
   
      Recursion recursion = new Recursion();
      
      System.out.println(recursion.doFactorial(5));
         
   }
   
   public int doFactorial(int n) {
   
      int answer;
   
      if (n == 1)
         return 1;
   
      answer = doFactorial (n - 1) * n;
       
      return answer;         
   }
   
}