package hw3;

import java.util.Scanner;

public class Equals {

   public static boolean equals(int[] array1, int[] array2) {
      if (array1 == null || array2 == null) {
         return false;
      }
      if (array1.length != array2.length) {
         return false;
      }
      for (int i = 0; i < array1.length; i++) {
         if (array1[i] != array2[i]) {
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Nhap so phan tu trong mang thu nhat: ");
      int n = in.nextInt();
      int[] array1 = new int[n];
      System.out.println("Nhap cac phan tu mang thu nhat:");
      for (int i = 0; i < n; i++) {
         System.out.printf("a[%d] = ", i);
         array1[i] = in.nextInt();
      }

      System.out.print("Nhap so phan tu trong mang thu hai: ");
      int n2 = in.nextInt();
      int[] array2 = new int[n2];
      System.out.println("Nhap cac phan tu mang thu hai:");
      for (int i = 0; i < n; i++) {
         System.out.printf("a[%d] = ", i);
         array2[i] = in.nextInt();
      }
      in.close();

      System.out.println("So sanh 2 mang: " + equals(array1, array2));
   }
}
