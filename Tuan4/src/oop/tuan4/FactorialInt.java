package oop.tuan4;

public class FactorialInt {
   public static int factorial(int n) {
      // check null
      if (n < 0) {
         return -1;
      }
      int factorial = 1;
      for (int i = 2; i <= n; i++) {
         factorial = factorial * i;
      }
      return factorial;
   }

   public static void main(String[] args) {
      int n = 1;
      while (Integer.MAX_VALUE / factorial(n - 1) >= n) {
         System.out.println("The factorial of " + n + " is " + factorial(n));
         n++;
      }
      System.out.println("The factorial of " + (n) + " is out of range");
   }
}
