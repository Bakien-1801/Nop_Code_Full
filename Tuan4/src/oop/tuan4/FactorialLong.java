package oop.tuan4;

public class FactorialLong {
   public static long factorial(int n) {
      long factorial = 1;
      for (int i = 2; i <= n; i++) {
         factorial = factorial * i;
      }
      return factorial;
   }

   public static void main(String[] args) {
      int n = 1;
      while (Long.MAX_VALUE / factorial(n - 1) >= n) {
         System.out.println("The factorial of " + n + " is " + factorial(n));
         n++;
      }
      System.out.println("The factorial of " + (n) + " is out of range");
   }

}
