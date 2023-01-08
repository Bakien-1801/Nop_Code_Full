package hw3;

import java.util.Scanner;

public class Contains {

   public static boolean contains(int[] array, int key) {
      if (array == null) {
         return false;
      }
      for (int i = 0; i < array.length; i++) {
         if (key == array[i]) {
            return true;
         }
      }
      return false;

   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Nhap so phan tu trong mang:");
      int n = in.nextInt();
      int[] array = new int[n];
      System.out.println("Nhap cac phan tu mang:");
      for (int i = 0; i < n; i++) {
         System.out.printf("a[%d] = ", i);
         array[i] = in.nextInt();
      }
      System.out.print("Enter key1: ");
      int key1 = in.nextInt();
      System.out.println(contains(array, key1));
      System.out.print("Enter key2: ");
      int key2 = in.nextInt();
      in.close();
      System.out.print(contains(array, key2));

   }

}
