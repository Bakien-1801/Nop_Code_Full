public class SumAverageRunningInt_while_do {
   public static void main(String[] args) {
      int sum = 0;
      double average;
      final int lowerbound = 1;
      final int upperbound = 100;
      // Use a while loop to sum from lowerbound to upperbound
      int number = lowerbound;
      do {
         sum += number;
         ++number;
      } while (number <= upperbound);
      // Compute average in double. Beware that int / int produces int
      average = (double) sum / (upperbound - lowerbound + 1);
      // Print sum and average
      System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
      System.out.println("The average is " + average);
   }
}
