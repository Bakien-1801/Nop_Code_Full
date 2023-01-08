public class ExtractDigits {
   public static void main(String[] args) {
      int number = 123456789;
      while (number > 0) {
         int digit = number % 10;
         //Printed on the same space as each other by the page space
         System.out.print(digit + " ");
         number /= 10;
      }
   }
   
}
