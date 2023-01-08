package hw3;

public class TestPrint {

   public static void print(int[] array) {
      if (array == null) {
         System.out.println("null");
      } else {
         System.out.print("[");
         for (int i = 0; i < array.length; i++) {
            if (i == 0) {
               System.out.print(array[i]);
            } else {
               System.out.print(", " + array[i]);
            }
         }
         System.out.println("]");
      }
   }

   public static void print(double[] array) {
      if (array == null) {
         System.out.println("null");
      } else {
         System.out.print("[");
         for (int i = 0; i < array.length; i++) {
            if (i == 0) {
               System.out.print(array[i]);
            } else {
               System.out.print(", " + array[i]);
            }
         }
         System.out.println("]");
      }
   }

   public static void print(float[] array) {
      if (array == null) {
         System.out.println("null");
      } else {
         System.out.print("[");
         for (int i = 0; i < array.length; i++) {
            if (i == 0) {
               System.out.print(array[i]);
            } else {
               System.out.print(", " + array[i]);
            }
         }
         System.out.println("]");
      }
   }

   public static void main(String[] args) {
      int[] emptyIntArray = {};
      print(emptyIntArray);
      int[] oneElementIntArray = { 1 };
      print(oneElementIntArray);
      // System.out.println();
      int[] nElementIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      print(nElementIntArray);
      System.out.println();

      double[] emptyDoubleArray = {};
      print(emptyDoubleArray);
      double[] oneElementDoubleArray = { 1.0 };
      print(oneElementDoubleArray);
      // System.out.println();
      double[] nElementDoubleArray = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0 };
      print(nElementDoubleArray);
      System.out.println();

      float[] emptyFloatArray = {};
      print(emptyFloatArray);
      float[] oneElementFloatArray = { 1.0f };
      print(oneElementFloatArray);
      // System.out.println();
      float[] nElementFloatArray = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f };
      print(nElementFloatArray);
      System.out.println();

   }
}
