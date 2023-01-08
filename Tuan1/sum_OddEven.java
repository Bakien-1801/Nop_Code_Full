public class sum_OddEven {
   public static void main(String[] args) {
      int sumOdd = 0;
      int sumEven = 0;
      int absDiff;
      // compute sums
      for (int number = 1; number <= 110; ++number) {
         if (number % 2 == 0) {
            sumEven += number;
         } else {
            sumOdd += number;
         }
      }
      // compute absolute difference
      if (sumOdd > sumEven) {
         absDiff = sumOdd - sumEven;
      } else {
         absDiff = sumEven - sumOdd;
      }
      // OR use one liner conditional expression
      absDiff = (sumOdd > sumEven) ? (sumOdd - sumEven) : (sumEven - sumOdd);
      // print results
      System.out.println("The sum of odd numbers from 1 to 100 is " + sumOdd);
      System.out.println("The sum of even numbers from 1 to 100 is " + sumEven);
      System.out.println("The absolute difference between the two sums is " + absDiff);

   }
}
