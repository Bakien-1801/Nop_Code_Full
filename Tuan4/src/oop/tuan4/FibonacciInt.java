package oop.tuan4;

public class FibonacciInt {
   public static int fibonacci(int n) {
      if (n == 0 || n == 1) {
         return 1;
      }
      int fn = 0;
      int fnMinus1 = 1;
      int fnMinus2 = 1;
      int i = 2;
      while (i <= n) {
         fn = fnMinus1 + fnMinus2;
         ++i;
         fnMinus2 = fnMinus1;
         fnMinus1 = fn;
      }
      return fn;
   }

   public static void main(String[] args) {
      int n = 0;
      while (Integer.MAX_VALUE - fibonacci(n - 1) >= fibonacci(n - 2)) { // check overflow of int type 
         System.out.println("F(" + n + ") = " + fibonacci(n));
         n++;
      }
      System.out.println("F(" + n + ") is out of range of int");
   }

}
