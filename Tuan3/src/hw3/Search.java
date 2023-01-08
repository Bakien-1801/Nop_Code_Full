package hw3;

import java.util.Scanner;

public class Search {

   public static int search(int[] array, int key) {
      if (array == null) {
         return -1;
      }
      for (int i = 0; i < array.length; i++) {
         if (key == array[i]) {
            System.out.print("Chi so cua mang la: ");
            return i;
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Nhap so phan tu trong mang: ");
      int n = in.nextInt();
      int[] array = new int[n];
      System.out.println("Nhap cac phan tu mang:");
      for (int i = 0; i < n; i++) {
         System.out.printf("a[%d] = ", i);
         array[i] = in.nextInt();
      }
      System.out.print("Enter key1: ");
      int key1 = in.nextInt();
      System.out.println(search(array, key1));
      System.out.print("Enter key2: ");
      int key2 = in.nextInt();
      in.close();
      System.out.print(search(array, key2));

   }
}
