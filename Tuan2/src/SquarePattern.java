import java.util.Scanner;

public class SquarePattern {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the size: ");
      int size = in.nextInt();
      in.close();
      // Outer loop to print each of the rows
      for (int row = 1; row <= size; row++) { // row = 1, 2, 3 ... size
         // Inner loop to print each of the columns of a particular row
         for (int col = 1; col <= size; col++) { // col = 1, 2, 3 ... size
            System.out.print("# "); // Use print() without newline inside the inner loop
         }
         // Print a newline after printing all the columns
         System.out.println();
      }
      System.out.println();

      int row = 1;
      int col = 1;
      while (row <= size) {
         while (col <= size) {
            System.out.print("# ");
            col++;
         }
         col = 1;
         System.out.println();
         row++;
      }
   }
}