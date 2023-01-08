package oop.tuan4;

public class TrigonometricSeries {
   public static double sin(double x, int numTerms) {
      double sin = x;
      // kiem tra null
      if (numTerms < 0) {
         return Double.NaN;
      }
      for (int i = 3; i <= numTerms; i = i + 2) {
         double temp = x;
         temp = temp * ((-1) * x * x / ((i - 1) * i));
         sin = sin + temp;
      }
      return sin;
   }

   public static double cos(double x, int numTerms) {
      double cos = 1;
      for (int i = 2; i <= numTerms; i = i + 2) {
         double temp = 1;
         temp = temp * ((-1) * x * x / ((i - 1) * i));
         cos = cos + temp;
      }
      return cos;
   }

   public static void main(String[] args) {
      int numTerms = 1000;
      System.out.println(sin(0, numTerms));
      System.out.println(Math.sin(0));
      System.out.println();

      System.out.println(cos(0, numTerms));
      System.out.println(Math.cos(0));
      System.out.println();

      System.out.println(sin(Math.PI / 6, numTerms));
      System.out.println(Math.sin(Math.PI / 6));
      System.out.println();

      System.out.println(cos(Math.PI / 6, numTerms));
      System.out.println(Math.cos(Math.PI / 6));
      System.out.println();

      System.out.println(sin(Math.PI / 4, numTerms));
      System.out.println(Math.sin(Math.PI / 4));
      System.out.println();

      System.out.println(cos(Math.PI / 4, numTerms));
      System.out.println(Math.cos(Math.PI / 4));
      System.out.println();

      System.out.println(sin(Math.PI / 3, numTerms));
      System.out.println(Math.sin(Math.PI / 3));
      System.out.println();

      System.out.println(cos(Math.PI / 3, numTerms));
      System.out.println(Math.cos(Math.PI / 3));
      System.out.println();

      System.out.println(sin(Math.PI / 2, numTerms));
      System.out.println(Math.sin(Math.PI / 2));
      System.out.println();

      System.out.println(cos(Math.PI / 2, numTerms));
      System.out.println(Math.cos(Math.PI / 2));
      System.out.println();
   }

}
