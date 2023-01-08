package oop.tuan4;

import java.util.Scanner;

public class NumberGuess {
   public static void main(String[] args) {
      final int SECRET_NUMBER = (int) (Math.random() * 100); // truncate to int
      Scanner in = new Scanner(System.in);
      System.out.println("Key in your guess:");
      int count = 1;

      while (true) {
         int guess = in.nextInt();

         if (guess < SECRET_NUMBER) {
            System.out.println("Try higher");
         } else if (guess > SECRET_NUMBER) {
            System.out.println("Try lower");
         } else {
            System.out.print("You got it in " + count);
            if (count == 1) {
               System.out.println(" trial!");
            } else {
               System.out.println(" trials!");
            }
            break;
         }
         count++;
      }
      in.close();
   }

}
