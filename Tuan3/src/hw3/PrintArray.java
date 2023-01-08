package hw3;

import java.util.Scanner;

public class PrintArray {
   public static void main(String[] args) {
      // Declare variables
      final int NUM_ITEMS;
      int[] items; // Declare array name, to be allocated after NUM_ITEMS is known
      // Prompt for the number of items and read the input as "int"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the number of items: ");
      NUM_ITEMS = in.nextInt();
      // Allocate the array
      items = new int[NUM_ITEMS];
      // Prompt and read the items into the "int" array, if array length > 0
      if (items.length > 0) {
         System.out.print("Enter the value of all items (separated by space): ");
         for (int i = 0; i < items.length; ++i) {
            items[i] = in.nextInt();
         }
      }
      in.close();
      // Print array contents, need to handle first item and subsequent items
      // differently
      for (int i = 0; i < items.length; i++) {
         if (i == 0) {
            // Print the first item without a leading commas
            System.out.print("The values are: [" + items[i]);
         } else if (i == items.length - 1) {
            // Print the last item with a trailing comma
            System.out.print(", " + items[i] + "]");
            break;
         } else {
            // Print the other items with a leading comma
            System.out.print(", " + items[i]);
         }
         // or, using a one liner
         // System.out.print((i == 0)) ? ..... : .....);
         /*
          * System.out.print((i == 0) ? "The values are: [" + items[i]
          * : (i == items.length - 1) ? ", " + items[i] + "]" : ", " + items[i]);
          */
      }
   }
}
