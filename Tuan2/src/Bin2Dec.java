import java.util.Scanner;

public class Bin2Dec {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;

      System.out.print("Enter a Binary string: ");
      inStr = in.next();
      in.close();
      try {
         int number = Integer.parseInt(inStr, 2);
         System.out.print("The equivalent decimal number for binary \"" + inStr + "\" is: " + number);
      } catch (Exception e) {
         System.out.print("error: invalid binary string \"" + inStr + "\"");
      }
   }
}
