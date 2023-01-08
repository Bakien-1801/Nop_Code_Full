import java.util.Scanner;

public class Oct2Dec {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;

      System.out.print("Enter an Octal string: ");
      inStr = in.next();
      in.close();
      try {
         int number = Integer.parseInt(inStr, 8);
         System.out.print("The equivalent decimal number for octal \"" + inStr + "\" is: " + number);
      } catch (Exception e) {
         System.out.print("error: invalid octal string \"" + inStr + "\"");
      }
   }
}
