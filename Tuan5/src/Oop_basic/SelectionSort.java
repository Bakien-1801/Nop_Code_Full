package Oop_basic;

import java.util.Scanner;

public class SelectionSort {
   public static void selectionSort(int[] array) {
      for (int i = 0; i < array.length - 1; i++) {
         int minIdx = i + 1;
         for (int j = i + 2; j < array.length; j++) {
            if (array[j] < array[minIdx]) {
               minIdx = j;
            }
         }
         int temp = array[i];
         array[i] = array[minIdx];
         array[minIdx] = temp;
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
      selectionSort(array);
      for (int i = 0; i < n; i++) {
         System.out.print(array[i] + " ");
      }
      sc.close();

   }

}
