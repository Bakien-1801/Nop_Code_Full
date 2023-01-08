import java.util.Scanner;

public class DecipherCaesarCode {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;
      int inStrLen;
      int n = 3;

      System.out.print("Enter a ciphertext string: ");
      inStr = in.next().toUpperCase();
      in.close();
      inStrLen = inStr.length();

      System.out.print("The plaintext string is: ");
      for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
         char inChar = inStr.charAt(charIdx);
         if ((int) inChar >= 65 + n) {
            System.out.print((char) (inChar - n));
         } else {
            System.out.print((char) (inChar + 26 - n));
         }
      }
   }
}
