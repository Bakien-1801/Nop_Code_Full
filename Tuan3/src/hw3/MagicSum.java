package hw3;

import java.util.Scanner;

public class MagicSum {
   public static void main(String[] args) {
      final int SENTINEL = -1;
      int number;
      // Read first input to "seed" the while-loop
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a positive integer (or -1 to end): ");
      number = in.nextInt();

      int sum = 0;
      while (number != SENTINEL) {
         if (hasEight(number)) {
            sum += number;
         }
         // Read next input. Repeat if the input is not the SENTINEL
         // Take note that you need to repeat these codes!
         System.out.print("Enter a positive integer (or -1 to end): ");
         number = in.nextInt();
      }
      in.close();
      System.out.println("The sum of all numbers with 8 is: " + sum);

   }

   public static boolean hasEight(int number) {
      while (number > 0) {
         if (number % 10 == 8) {
            return true;
         } else {
            number /= 10;
         }
      }
      return false;
   }

}
