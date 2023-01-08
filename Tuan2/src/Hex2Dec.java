import java.util.Scanner;

public class Hex2Dec {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;

      System.out.print("Enter a Hexadecimal string: ");
      inStr = in.next().toLowerCase();
      in.close();
      try {
         int number = Integer.parseInt(inStr, 16);
         System.out.print("The equivalent decimal number for hexadecimal \"" + inStr + "\" is: " + number);
      } catch (Exception e) {
         System.out.print("error: invalid hexadecimal string \"" + inStr + "\"");
      }
   }
}
