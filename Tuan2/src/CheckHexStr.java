import java.util.Scanner;

public class CheckHexStr {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;
      int inStrLen;

      System.out.print("Enter a hex string: ");
      inStr = in.next();
      in.close();
      inStrLen = inStr.length();

      boolean test = true;
      for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
         char inChar = inStr.charAt(charIdx);
         if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F')
               || (inChar >= 'a' && inChar <= 'f'))) { // Use positive logic and then reverse
            test = false;
         }
      }

      if (test) {
         System.out.println("\"" + inStr + "\" is a hex string");
      } else {
         System.out.println("\"" + inStr + "\" is NOT a hex string");
      }
   }
}
