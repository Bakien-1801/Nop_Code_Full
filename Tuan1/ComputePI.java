public class ComputePI {
   public static void main(String[] args) {
      double sum = 0.0;
      final int MAX_DENOMINATOR = 1000000;
      for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
         if (denominator % 4 == 1) {
            sum += 1.0 / denominator;
         } else if (denominator % 4 == 3) {
            sum -= 1.0 / denominator;
         } else { // remainder of 0 or 2
            System.out.println("Impossible!");
         }
      }
      System.out.println("The sum is " + sum * 4);
      /*
       * JDK maintains the value of π in a built-in double constant called Math.PI
       * (= 3.141592653589793). Add a statement to compare the values obtained and the
       * Math.PI, in percents of Math.PI, i.e., (piComputed / Math.PI) ∗100.
       */
      System.out.println("The value of Math.PI is " + Math.PI);
      System.out.println("The value of piComputed is " + sum * 4);
      System.out.println("The value of piComputed / Math.PI is " + (sum * 4) / Math.PI);
      System.out.println("The value of (piComputed / Math.PI) * 100 is " + ((sum * 4) / Math.PI) * 100);

   }
}
