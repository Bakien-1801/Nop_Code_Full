package oop.tuan4;

public class ExponentialSeries {
   public static double specialSeries(double x, int numTerms) {
      // double result = x;
      // kiem tra null
      // if (numTerms < 0) {
      // return Double.NaN;
      // }
      // for (int i = 3; i <= numTerms; i = i + 2) {
      // double temp = x;
      // int numerator = 1;
      // int denominator = 2;
      // temp = temp * x * x;
      // result = result + (double) numerator / denominator * temp / i;
      // numerator = numerator * (numerator + 2);
      // denominator = denominator * (denominator + 2);
      // }
      // return result;
      double frac = x;
      double res = x;
      for (int i = 1; i < numTerms; i++) {
         frac = frac * (2 * i - 1) / (2 * i) * (2 * i - 1) / (2 * i + 1) * x * x;
         res += frac;
      }
      return res;
   }

   public static void main(String[] args) {
      int numTerms = 100;
      System.out.println(specialSeries(0.5, numTerms));
      System.out.println();
   }

}
