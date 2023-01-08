import java.util.Scanner;

public class ExchangeCipher {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;
      int inStrLen;

      System.out.print("Enter a plaintext string: ");
      inStr = in.next().toUpperCase();
      in.close();
      inStrLen = inStr.length();

      System.out.print("The ciphertext string is: ");
      for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
         char inChar = inStr.charAt(charIdx);
         char plainTextChar = inChar;
         char cipherTextChar = (char) ('A' + 'Z' - plainTextChar);
         System.out.print(cipherTextChar);
      }
   }
}
