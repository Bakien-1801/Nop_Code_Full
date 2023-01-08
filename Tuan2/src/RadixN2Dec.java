import java.util.Scanner;

public class RadixN2Dec {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;

      System.out.print("Enter the radix: ");
      inStr = in.next();
      int radix = Integer.parseInt(inStr);
      System.out.print("Enter the string: ");
      inStr = in.next().toLowerCase();
      in.close();
      String string = inStr;
      try {
         int number = Integer.parseInt(string, radix);
         System.out.print("The equivalent decimal number \"" + string + "\" is: " + number);
      } catch (Exception e) {
         System.out.print("error: invalid string \"" + string + "\"");
      }
   }
}
