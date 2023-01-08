import java.util.Scanner;

public class PhoneKeyPad {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String inStr;
      int inStrLen;

      System.out.print("Enter a String: ");
      inStr = in.next().toLowerCase();
      in.close();
      inStrLen = inStr.length();

      for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
         char inChar = inStr.charAt(charIdx);
         if ((inChar == 'a') || (inChar == 'b') || (inChar == 'c')) {
            System.out.print(2);
         } else if (inChar == 'd' || (inChar == 'e') || (inChar == 'f')) {
            System.out.print(3);
         } else if ((inChar == 'g') || (inChar == 'h') || (inChar == 'i')) {
            System.out.print(4);
         } else if ((inChar == 'j') || (inChar == 'k') || (inChar == 'l')) {
            System.out.print(5);
         } else if ((inChar == 'm') || (inChar == 'n') || (inChar == 'o')) {
            System.out.print(6);
         } else if ((inChar == 'p') || (inChar == 'q') || (inChar == 'r') || (inChar == 's')) {
            System.out.print(7);
         } else if ((inChar == 't') || (inChar == 'u') || (inChar == 'v')) {
            System.out.print(8);
         } else if ((inChar == 'w') || (inChar == 'x') || (inChar == 'y') || (inChar == 'z')) {
            System.out.print(9);
         }
      }

      System.out.println();

      for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
         char inChar = inStr.charAt(charIdx);
         switch (inChar) {
            case 'a':
            case 'b':
            case 'c': // No break for 'a' and 'b', fall thru 'c'
               System.out.print(2);
               break;
            case 'd':
            case 'e':
            case 'f':// No break for 'd' and 'e', fall thru 'f'
               System.out.print(3);
               break;
            case 'g':
            case 'h':
            case 'i':// No break for 'g' and 'h', fall thru 'i'
               System.out.print(4);
               break;
            case 'j':
            case 'k':
            case 'l':// No break for 'j' and 'k', fall thru 'l'
               System.out.print(5);
               break;
            case 'm':
            case 'n':
            case 'o':// No break for 'm' and 'n', fall thru 'o'
               System.out.print(6);
               break;
            case 'p':
            case 'q':
            case 'r':
            case 's':// No break for 'p', 'q' and 'r', fall thru 's'
               System.out.print(7);
               break;
            case 't':
            case 'u':
            case 'v':// No break for 't' and 'u', fall thru 'v'
               System.out.print(8);
               break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':// No break for 'w', 'x' and 'y', fall thru 'z'
               System.out.print(9);
               break;
            default:

         }
      }
   }

}
