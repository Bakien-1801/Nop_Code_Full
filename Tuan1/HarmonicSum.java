public class HarmonicSum {
   public static void main(String[] args) {

      final int MAX_DENOMINATOR = 50000;
      double sumL2R = 0.0;
      double sumR2L = 0.0;
      double absDiff;
      // for−loop for summing from left −to−right
      for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
         // denominator = 1 , 2 , 3 , 4 , 5 , . . . , MAX DENOMINATOR
         sumL2R += 1.0 / denominator;
      }
      System.out.println("The sum from left to right is " + sumL2R);

      // for−loop for summing from right −to−left
      for (int denominator = MAX_DENOMINATOR; denominator >= 1; --denominator) {
         // denominator = MAX DENOMINATOR , MAX DENOMINATOR − 1 , . . . , 2 , 1
         sumR2L += 1.0 / denominator;
      }
      System.out.println("The sum from right to left is " + sumR2L);
      // Find the absolute difference and display
      if (sumL2R > sumR2L) {
         absDiff = sumL2R - sumR2L;
      } else {
         absDiff = sumR2L - sumL2R;
      }

   }

}
