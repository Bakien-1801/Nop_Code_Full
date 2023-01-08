import java.util.Scanner;

public class CheckerPattern {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the size: ");
      int size = in.nextInt();
      in.close();
      // Outer loop to print e++ach of the rows
      for (int row = 1; row <= size; row++) { // row = 1, 2, 3 ... size
         // Inner loop to print each of the columns of a particular row
         for (int col = 1; col <= size; col++) { // col = 1, 2, 3 ... size
            if ((row % 2) == 0) { // row 2, 4, 6 ...
               System.out.print(" #");
               continue;
            }
            System.out.print("# "); // Use print() without newline inside the inner loop
         }
         // Print a newline after printing all the columns
         System.out.println();
      }
   }
}
