package oop.tuan4;

import java.util.Scanner;

public class NumberConversion {
   public static String toRadix(String in, int inRadix, int outRadix) {
      if (in == null) {
         return null;
      }
      return "\"" + in + "\" in radix " + inRadix + " is \""
            + Integer.toString(Integer.parseInt(in, inRadix), outRadix) + "\" in radix " + outRadix + ".";
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number and radix: ");
      String inStr = in.next();
      System.out.print("Enter the input radix: ");
      int inRadix = in.nextInt();
      System.out.print("Enter the output and radix: ");
      int outRadix = in.nextInt();
      in.close();
      System.out.println(toRadix(inStr, inRadix, outRadix));
   }

}
