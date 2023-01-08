package oop.tuan4;

import java.util.Scanner;

public class WordGuess {
   public static void main(String[] args) {
      // System.out.println();
      WordGuess.guessWord(args);
   }

   public static void guessWord(String[] str) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a String: ");
      String word = sc.nextLine();

      boolean[] bGuess = new boolean[word.length()];
      int trials = 0;

      while (true) {
         System.out.print("Key in one character or your guess word: ");
         String guess = sc.nextLine();
         trials++;

         if (guess.length() > 1) {
            if (guess.equalsIgnoreCase(word))
               for (int i = 0; i < bGuess.length; i++)
                  bGuess[i] = true;
         } else {
            for (int i = 0; i < word.length(); i++) {
               if (guess.equalsIgnoreCase(word.charAt(i) + ""))
                  bGuess[i] = true;
            }
         }

         System.out.print("Trial " + trials + ": ");
         for (int i = 0; i < word.length(); i++) {
            if (bGuess[i])
               System.out.print(" " + word.charAt(i));
            else
               System.out.print(" _");
         }
         System.out.println();

         if (endGame(bGuess)) {
            System.out.println("Congratulations! You got it in "
                  + trials + " trial" + (trials == 1 ? "!" : "s!"));
            break;
         }
      }
      sc.close();
   }

   private static boolean endGame(boolean[] bool) {
      for (boolean b : bool)
         if (!b) // if there is a false in bool
            return false;
      return true;
   }
}
