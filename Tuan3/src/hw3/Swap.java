package hw3;

import java.util.Scanner;

public class Swap {

   public static boolean swap(int[] array_1, int[] array_2) {
      if (array_1 == null || array_2 == null) {
         return false;
      }
      if (array_1.length != array_2.length) {
         return false;
      } else {
         for (int i = 0; i < array_1.length; i++) {
            int temp = array_1[i];
            array_1[i] = array_2[i];
            array_2[i] = temp;
         }
         return true;
      }
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Nhap so phan tu trong mang thu nhat: ");
      int n = in.nextInt();
      int[] array_1 = new int[n];
      System.out.print("Nhap cac phan tu mang thu nhat:");
      for (int i = 0; i < n; i++) {
         // System.out.print("a[%d] = ", i);
         array_1[i] = in.nextInt();
      }

      System.out.print("Nhap so phan tu trong mang thu hai: ");
      int n2 = in.nextInt();
      int[] array_2 = new int[n2];
      System.out.print("Nhap cac phan tu mang thu hai:");
      for (int i = 0; i < n; i++) {
         // System.out.printf("a[%d] = ", i);
         array_2[i] = in.nextInt();
      }
      System.out.println(swap(array_1, array_2));
      System.out.print("Nhap so phan tu trong mang thu ba: ");
      int n3 = in.nextInt();
      int[] array_3 = new int[n3];
      System.out.print("Nhap cac phan tu mang thu ba:");
      for (int i = 0; i < n; i++) {
         // System.out.printf("a[%d] = ", i);
         array_3[i] = in.nextInt();
      }
      in.close();
      System.out.println(swap(array_1, array_3));

   }

}
