
public class sumSquares {
   public static void main(String[] args) {
      int sum = 0;
      final int lowerbound = 1;
      final int upperbound = 100;
      for (int number = lowerbound; number <= upperbound; ++number) {
         sum += (number * number);
      }
      System.out.println("The sum of the squares of " + lowerbound + " to " + upperbound + " is " + sum);
   }

}