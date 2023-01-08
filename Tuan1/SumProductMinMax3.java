import java.util.Scanner;

public class SumProductMinMax3 {
   public static void main(String[] args) {
      int number1;
      int number2;
      int number3;
      // To compute these
      int sum;
      int product;
      int min;
      int max;
      // Prompt and read inputs as "int"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter 3 integers separated by spaces: ");
      number1 = in.nextInt();
      number2 = in.nextInt();
      number3 = in.nextInt();
      in.close();
      // Compute sum, product, min and max
      sum = number1 + number2 + number3;
      product = number1 * number2 * number3;
      min = number1;
      if (number2 < min) {
         min = number2;
      }
      if (number3 < min) {
         min = number3;
      }
      max = number1;
      if (number2 > max) {
         max = number2;
      }
      if (number3 > max) {
         max = number3;
      }
      // Print sum, product, min and max
      System.out.println("The sum is " + sum);
      System.out.println("The product is " + product);
      System.out.println("The min is " + min);
      System.out.println("The max is " + max);
      
   }
   
   
}
