import java.util.Scanner;

public class HillPatternX {
   public static void HillPatternA(int size) {
      int numRows = size;
      int numCols = 2 * numRows - 1;
      for (int row = 1; row <= numRows; row++) {
         for (int col = 1; col <= numCols; col++) {
            if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }

   public static void HillPatternB(int size) {
      int numRows = size;
      int numCols = 2 * numRows - 1;
      for (int row = numRows; row >= 1; row--) {
         for (int col = numCols; col >= 1; col--) {
            if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }

   public static void HillPatternC(int size) {
      int numRows = size;
      int numCols = 2 * numRows - 1;
      for (int row = 1; row <= numRows; row++) {
         for (int col = 1; col <= numCols; col++) {
            if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
      for (int row = numRows - 1; row >= 1; row--) {
         for (int col = numCols; col >= 1; col--) {
            if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }

   public static void HillPatternD(int size) {
      int numRows = size;
      int numCols = 2 * numRows - 1;
      for (int row = 1; row <= numRows; row++) {
         for (int col = 1; col <= numCols; col++) {
            if ((row + col > numRows + 1) && (row > col - numRows + 1)) {
               System.out.print("  ");
            } else {
               System.out.print("# ");
            }
         }
         System.out.println();
      }
      for (int row = numRows - 1; row >= 1; row--) {
         for (int col = numCols; col >= 1; col--) {
            if ((row + col > numRows + 1) && (row > col - numRows + 1)) {
               System.out.print("  ");
            } else {
               System.out.print("# ");
            }
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the rows: ");
      int size = in.nextInt();
      in.close();
      System.out.println("a,");
      HillPatternA(size);
      System.out.println("b,");
      HillPatternB(size);
      System.out.println("c,");
      HillPatternC(size);
      System.out.println("d,");
      HillPatternD(size);

   }
}
