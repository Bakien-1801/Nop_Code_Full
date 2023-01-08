import java.util.Scanner;

public class TestPalindromicPhrase {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;
      int inStrLen;

      System.out.print("Enter a phrase: ");
      inStr = in.nextLine().toLowerCase();
      in.close();
      inStrLen = inStr.length();
      int strLen = inStrLen;

      int fIdx = 0;
      int bIdx = strLen - 1;
      boolean test = true;
      while (fIdx < bIdx) {
         if (Character.isLetter(inStr.charAt(fIdx))) {
            if (Character.isLetter(inStr.charAt(bIdx))) {
               if (inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
                  test = false;
                  break;
               }
               ++fIdx;
               --bIdx;
            } else {
               --bIdx;
            }
         } else {
            ++fIdx;
         }
      }
      if (test) {
         System.out.println("\"" + inStr + "\" is a palindrome phrase.");
      } else {
         System.out.println("\"" + inStr + "\" is not a palindrome phrase.");
      }
   }
}
