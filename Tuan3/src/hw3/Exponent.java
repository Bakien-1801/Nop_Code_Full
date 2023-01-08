package hw3;

import java.util.Scanner;

public class Exponent {
   public static void main(String[] args) {
      // DecLare variables
      int base, exp;
      // Prompt and read the base and exp
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the base: ");
      base = in.nextInt();
      System.out.print("Enter the exponent: ");
      exp = in.nextInt();
      in.close();
      // Print the result
      System.out.println(base + " to the power of " + exp + " is: " + base + "^" + exp + " = " + exponent(base, exp));
   }

   public static int exponent(int base, int exp) {
      int product = 1;
      for (int i = 1; i <= exp; i++) {
         product *= base;
      }
      return product;
   }

}
