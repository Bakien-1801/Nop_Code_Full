import java.util.Scanner;

public class TriangularPatternX {
   public static void TriangularPatternA(int size) {
      // Outer loop to print each of the rows
      for (int row = 1; row <= size; row++) { // row = 1, 2, 3 ... size
         // Inner loop to print each of the columns of a particular row
         for (int col = 1; col <= size; col++) { // col = 1, 2, 3 ... size
            if (row >= col) {
               System.out.print("# ");
            } else {
               System.out.print("  "); // Need to print the "leading" blanks
            }
         }
         // Print a newline after printing all the columns
         System.out.println();
      }
   }

   public static void TriangularPatternB(int size) {
      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= size; col++) {
            if (row + col <= size + 1) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }

   public static void TriangularPatternC(int size) {
      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= size; col++) {
            if (row < col) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }

   public static void TriangularPatternD(int size) {
      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= size; col++) {
            if (row + col >= size + 1) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the size: ");
      int size = in.nextInt();
      in.close();
      TriangularPatternA(size);
      System.out.println();
      TriangularPatternB(size);
      System.out.println();
      TriangularPatternC(size);
      System.out.println();
      TriangularPatternD(size);

   }
}
