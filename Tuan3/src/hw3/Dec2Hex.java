package hw3;

import java.util.Scanner;

public class Dec2Hex {
   public static void main(String[] args) {
      // Declare variables
      int decimal;
      String hex = "";
      // Prompt for the number of items and read the input as "int"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a decimal number: ");
      decimal = in.nextInt();
      in.close();
      // Convert decimal to hex
      while (decimal > 0) { // Loop until decimal is 0
         int hexValue = decimal % 16; // Get the remainder of decimal / 16
         char hexDigit = (hexValue <= 9 && hexValue >= 0) ? (char) (hexValue + '0')
               : (char) (hexValue - 10 + 'A');
         // Convert a decimal value to a hex digit (0-9 or A-F) and append it to hex
         // string
         hex = hexDigit + hex; // Insert hexDigit to the front of hex
         decimal = decimal / 16; // Divide decimal by 16
      }
      // Print the result
      System.out.println("The hex number is " + hex);

   }

}
