package Oop_basic;

import java.util.Scanner;

public class BubbleSort {
   public static void bubbleSort(int[] array) {
      for (int i = array.length - 1; i > 0; i--) {
         for (int j = 0; j < i; j++) {
            if (array[j] > array[j + 1]) {
               int temp = array[j];
               array[j] = array[j + 1];
               array[j + 1] = temp;
            }
         }
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
      bubbleSort(array);
      for (int i = 0; i < n; i++) {
         System.out.print(array[i] + " ");
      }
      sc.close();
   }

}
