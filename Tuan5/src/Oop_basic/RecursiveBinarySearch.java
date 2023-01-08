package Oop_basic;

public class RecursiveBinarySearch {
   public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
      if (fromIdx == toIdx - 1) {
         if (key == array[fromIdx]) {
            return true;
         } else {
            return false;
         }
      } else {
         int middleIdx = (fromIdx + toIdx) / 2;
         if (key == array[middleIdx]) {
            return true;
         } else if (key < array[middleIdx]) {
            toIdx = middleIdx;
         } else {
            fromIdx = middleIdx + 1;
         }
         return binarySearch(array, key, fromIdx, toIdx);
      }
   }

   public static int binarySearchIndex(int[] array, int key, int fromIdx, int toIdx) {
      if (fromIdx == toIdx - 1) {
         if (key == array[fromIdx]) {
            return fromIdx;
         } else {
            return -1;
         }
      } else {
         int middleIdx = (fromIdx + toIdx) / 2;
         if (key == array[middleIdx]) {
            return middleIdx;
         } else if (key < array[middleIdx]) {
            toIdx = middleIdx;
         } else {
            fromIdx = middleIdx + 1;
         }
         return binarySearchIndex(array, key, fromIdx, toIdx);
      }
   }

   public static void main(String[] args) {
      int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      System.out.println(binarySearch(array, 5, 0, array.length));
      System.out.println(binarySearchIndex(array, 5, 0, array.length));

   }
}
