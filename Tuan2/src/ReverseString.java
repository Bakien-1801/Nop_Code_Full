import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
      // Define variables
      Scanner in = new Scanner(System.in);
      String inStr; // input String
      int inStrLen; // length of the input String

      // Prompt and read input as "String"
      System.out.print("Enter a String: ");
      inStr = in.next(); // use next() to read a String
      in.close();
      inStrLen = inStr.length();

      // Use inStr.charAt(index) in a loop to extract each character
      // The String's index begins at 0 from the left.
      // Process the String from the left
      System.out.print("The reverse of the String \"" + inStr + "\" is \"");
      for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
         // charIdx = inStrLen - 1, inStrLen - 2 ... 0
         System.out.print(inStr.charAt(charIdx));
      }
      System.out.print("\".");
   }
}
