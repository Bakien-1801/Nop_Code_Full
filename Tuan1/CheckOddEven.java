import java.util.Scanner;

public class CheckOddEven {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Nhap so: ");
      int number = sc.nextInt();
      System.out.println("The number is " + number);
      if (number % 2 == 0) {
         System.out.println("Even");
      } else {
         System.out.println("Odd");
      }
   }

}
