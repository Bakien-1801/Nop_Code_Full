package hw3;

import java.util.Scanner;

public class Reverse {

   public static void reverse(int[] array) {
      if (array == null) {
         return;
      }
      for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
         // Only need to tranverse half of the array elements
         if (fIdx > array.length / 2) {
            break;
         }

         // Swap array[fIdx] and array[bIdx]
         int temp = array[fIdx];
         array[fIdx] = array[bIdx];
         array[bIdx] = temp;
      }

   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Nhap so phan tu trong mang: ");
      int n = in.nextInt();
      int[] array = new int[n];
      in.close();
      System.out.print("Nhap cac phan tu mang: ");
      for (int i = 0; i < n; i++) {
         // System.out.print("a[%d] = ", i);
         array[i] = in.nextInt();
      }
      reverse(array);
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }
   }

}
