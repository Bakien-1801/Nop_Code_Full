import java.util.Scanner;

public class CaesarCode {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;
      int inStrLen;
      System.out.print("Enter n: ");
      int n = in.nextInt();
      in.nextLine();
      System.out.print("Enter a plaintext string: ");
      inStr = in.next().toUpperCase();
      in.close();
      inStrLen = inStr.length();
      System.out.print("The ciphertext string is: ");
      for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
         char inChar = inStr.charAt(charIdx);
         if ((int) inChar <= 90 - n) {
            System.out.print((char) (inChar + n));
         } else {
            System.out.print((char) (inChar - 26 + n));
         }
      }
   }
}
