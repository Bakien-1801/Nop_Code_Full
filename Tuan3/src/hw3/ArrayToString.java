package hw3;

public class ArrayToString {
   public static String arrayToString(int[] array) {
      if (array == null) {
         return "null";
      }
      String result = "";
      for (int i = 0; i < array.length; i++) {
         if (i == 0) {
            result += array[i];
         } else {
            result += ", " + array[i];
         }
      }
      return "[" + result + "]";
   }

   public static void main(String[] args) {
      int[] emptyArray = {};
      System.out.println(arrayToString(emptyArray));
      int[] oneElementArray = { 1 };
      System.out.println(arrayToString(oneElementArray));
      int[] nElementArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      System.out.println(arrayToString(nElementArray));

   }

}
