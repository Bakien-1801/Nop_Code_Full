import java.util.Scanner;

public class Reverse_Int {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int inNumber = in.nextInt();
      int inDigit;
      int reverse_int = 0;
      while (inNumber != 0) {
         inDigit = inNumber % 10;
         reverse_int = reverse_int * 10 + inDigit;
         inNumber /= 10;
      }
      System.out.println("The reverse is: " + reverse_int);
   }

}
