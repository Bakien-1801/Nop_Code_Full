import java.util.Scanner;

public class Input_Validation {
   public static void main(String[] args) {
      int numberInput;
      boolean isValid;
      Scanner in = new Scanner(System.in);
      isValid = false;
      do {
         System.out.print("Enter a number between 0-10 or 90-100: ");
         numberInput = in.nextInt();
         if (numberInput >= 0 && numberInput <= 10 || numberInput >= 90 && numberInput <= 100) {
            isValid = true;
         } else {
            System.out.println("Invalid input, try again...");
         }
      } while (!isValid);
      System.out.print("You have entered: " + numberInput);
   }

}