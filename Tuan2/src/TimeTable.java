import java.util.Scanner;

public class TimeTable {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the size: ");
      int size = in.nextInt();
      in.close();
      System.out.printf("%2s%2s", "*", "|");
      for (int col = 1; col <= size; col++) {
         System.out.printf("%4d", col);
      }
      System.out.println();
      for (int col = 1; col <= size + 1; col++) {
         System.out.printf("%4s", "----");
      }
      System.out.println();
      for (int row = 1; row <= size; row++) {
         System.out.printf("%2d%2s", row, "|");
         for (int col = 1; col <= size; col++) {
            System.out.printf("%4d", row * col);
         }
         System.out.println();
      }
   }
}
