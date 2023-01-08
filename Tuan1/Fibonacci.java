public class Fibonacci {
   public static void main(String[] args) {
      int n = 3;
      int fn; // Fibonacci number
      int fnMinus1 = 1; // Fibonacci number F(n−1)
      int fnMinus2 = 1; // Fibonacci number F(n−2)
      int nMax = 20;
      int sum = fnMinus1 + fnMinus2;
      double average;
      System.out.println("The first " + nMax + " Fibonacci numbers are: ");
      System.out.println(fnMinus2); // Print the first Fibonacci number
      System.out.println(fnMinus1); // Print the second Fibonacci number
      while (n <= nMax) {
         fn = fnMinus1 + fnMinus2;
         System.out.println(fn); 
         // Increment the index n and shift the numbers for the next iteration
         ++n;
         fnMinus2 = fnMinus1;
         fnMinus1 = fn;
         sum += fn;
      }
      average = (double) sum / nMax;
      System.out.println("The average is " + average);
   }
   
   
}
