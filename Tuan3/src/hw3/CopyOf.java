package hw3;

import java.util.Scanner;

public class CopyOf {

   public static int[] copyOf(int[] array) {
      if (array == null) {
         return null;
      }
      int[] copy = new int[array.length];
      for (int i = 0; i < array.length; i++) {
         copy[i] = array[i];
      }
      return copy;

   }

   public static int[] copyOf(int[] array, int newLength) {
      if (array == null) {
         return null;
      }
      int[] copy = new int[newLength];
      if (newLength < array.length) {
         for (int i = 0; i < newLength; i++) {
            copy[i] = array[i];
         }
      } else {
         for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
         }
         for (int i = array.length; i < newLength; i++) {
            copy[i] = 0;
         }
      }
      return copy;

   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Nhap so phan tu trong mang: ");
      int n = in.nextInt();
      int[] array = new int[n];
      int[] copy_1 = copyOf(array);
      for (int i = 0; i < copy_1.length; i++) {
         System.out.printf("a[%d] = ", i);
         array[i] = in.nextInt();
      }
      System.out.println();

      System.out.print("Nhap newLength_2: ");
      int newLength_2 = in.nextInt();
      int[] copy_2 = copyOf(array, newLength_2);
      for (int i = 0; i < copy_2.length; i++) {
         System.out.print(copy_2[i] + " ");
      }
      System.out.println();

      System.out.print("Nhap newLength_3: ");
      int newLength_3 = in.nextInt();
      int[] copy_3 = copyOf(array, newLength_3);
      for (int i = 0; i < copy_3.length; i++) {
         System.out.print(copy_3[i] + " ");
      }
      in.close();
      System.out.println();
   }
}
