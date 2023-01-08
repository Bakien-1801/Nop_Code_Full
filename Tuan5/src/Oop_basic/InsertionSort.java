package Oop_basic;

import java.util.Scanner;

public class InsertionSort {
   public static void insertionSort(int[] array) {
      for (int i = 1; i < array.length; i++) {
         int current = array[i];
         int j = i - 1;
         while (j >= 0 && current < array[j]) {
            array[j + 1] = array[j];
            j--;
         }
         array[j + 1] = current;
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size: ");
      int n = Integer.parseInt(sc.nextLine());
      int[] array = new int[n];
      System.out.print("Enter the array: ");
      for (int i = 0; i < n; i++) {
         array[i] = sc.nextInt();
      }
      System.out.print("The array after sorting is: ");
      insertionSort(array);
      for (int i = 0; i < n; i++) {
         System.out.print(array[i] + " ");
      }
      sc.close();
   }
}
