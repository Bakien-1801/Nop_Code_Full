import java.util.Scanner;

public class CountVowelsDigits {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;
      int inStrLen;
      int numberOfVowels = 0;
      int numberOfDigits = 0;

      System.out.print("Enter a String: ");
      inStr = in.next().toLowerCase();
      in.close();
      inStrLen = inStr.length();

      for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
         if ((inStr.charAt(charIdx) == 'a') || (inStr.charAt(charIdx) == 'e') || (inStr.charAt(charIdx) == 'i')
               || (inStr.charAt(charIdx) == 'o') || (inStr.charAt(charIdx) == 'u')) {
            numberOfVowels++;
         }
      }
      for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
         if (Character.isDigit(inStr.charAt(charIdx))) {
            numberOfDigits++;
         }
      }

      System.out.printf("Number of vowels: %d (%.2f%%)", numberOfVowels, (double) numberOfVowels / inStrLen * 100);
      System.out.println();
      System.out.printf("Number of digits: %d (%.2f%%)", numberOfDigits, (double) numberOfDigits / inStrLen * 100);
   }
}
