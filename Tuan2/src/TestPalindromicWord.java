import java.util.Scanner;

public class TestPalindromicWord {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;
      int inStrLen;

      System.out.print("Enter a word: ");
      inStr = in.next().toLowerCase();
      in.close();
      inStrLen = inStr.length();
      int strLen = inStrLen;

      int fIdx = 0;
      int bIdx = strLen - 1;
      boolean test = true;
      while (fIdx < bIdx) {
         if (inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
            test = false;
            break;
         }
         ++fIdx;
         --bIdx;
      }
      if (test) {
         System.out.println("\"" + inStr + "\" is a palindrome.");
      } else {
         System.out.println("\"" + inStr + "\" is not a palindrome.");
      }

      // or
      // for (int fIdx = 0, bIdx = strLen - 1; fIdx < bIdx; ++fIdx, --bIdx) {
      // ...
      // }
   }
}
