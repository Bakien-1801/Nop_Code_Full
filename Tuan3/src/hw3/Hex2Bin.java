package hw3;

import java.util.Scanner;

public class Hex2Bin {
   public static void main(String[] args) {
      final String[] HEX_BITS = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001",
            "1010", "1011", "1100", "1101", "1110", "1111" };
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a Hexadecimal string 0-9 && Aa - Ff: ");
      String hexString = in.next();
      int hexStringLength = hexString.length();
      in.close();

      System.out.print("The equivalent binary for Hexadecimal \"" + hexString + "\" is: ");
      for (int charIdx = 0; charIdx < hexStringLength; charIdx++) {
         char hexChar = hexString.charAt(charIdx);
         switch (hexChar) {
            case '0':
               System.out.print(HEX_BITS[0] + " ");
               break;
            case '1':
               System.out.print(HEX_BITS[1] + " ");
               break;
            case '2':
               System.out.print(HEX_BITS[2] + " ");
               break;
            case '3':
               System.out.print(HEX_BITS[3] + " ");
               break;
            case '4':
               System.out.print(HEX_BITS[4] + " ");
               break;
            case '5':
               System.out.print(HEX_BITS[5] + " ");
               break;
            case '6':
               System.out.print(HEX_BITS[6] + " ");
               break;
            case '7':
               System.out.print(HEX_BITS[7] + " ");
               break;
            case '8':
               System.out.print(HEX_BITS[8] + " ");
               break;
            case '9':
               System.out.print(HEX_BITS[9] + " ");
               break;
            case 'A':
            case 'a':
               System.out.print(HEX_BITS[10] + " ");
               break;
            case 'B':
            case 'b':
               System.out.print(HEX_BITS[11] + " ");
               break;
            case 'C':
            case 'c':
               System.out.print(HEX_BITS[12] + " ");
               break;
            case 'D':
            case 'd':
               System.out.print(HEX_BITS[13] + " ");
               break;
            case 'E':
            case 'e':
               System.out.print(HEX_BITS[14] + " ");
               break;
            case 'F':
            case 'f':
               System.out.print(HEX_BITS[15] + " ");
               break;
            default:
               System.out.println("Invalid Hexadecimal string.");
               System.exit(1);
         }
      }
   }
}
