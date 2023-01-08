import java.util.Scanner;

public class BoxPatternX {
   public static void BoxPatternA(int size) {
      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= size; col++) {
            if (row == 1 || row == size || col == 1 || col == size) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }

   public static void BoxPatternB(int size) {
      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= size; col++) {
            if (row == 1 || row == size || row == col) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }

   public static void BoxPatternC(int size) {
      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= size; col++) {
            if (row == 1 || row == size || row + col == size + 1) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }

   public static void BoxPatternD(int size) {
      for (int row = 1; row <= size; row++) {
         for (int col = 1; col <= size; col++) {
            if (row == 1 || row == size || row == col || row + col == size + 1) {
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
      BoxPatternA(size);
      System.out.println("a)");
      BoxPatternB(size);
      System.out.println("b)");
      BoxPatternC(size);
      System.out.println("c)");
      BoxPatternD(size);
      System.out.println("d)");
   }
}
