import java.util.Scanner;

public class PrintDayInWord {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Nhap so: ");
      int dayNumber = sc.nextInt();
      System.out.println("The day is " + dayNumber);
      if (dayNumber == 1) {
         System.out.println("MONDAY");
      } else if (dayNumber == 2) {
         System.out.println("TUESDAY");
      } else if (dayNumber == 3) {
         System.out.println("WEDNESDAY");
      } else if (dayNumber == 4) {
         System.out.println("THURSDAY");
      } else if (dayNumber == 5) {
         System.out.println("FRIDAY");
      } else if (dayNumber == 6) {
         System.out.println("SATURDAY");
      } else if (dayNumber == 7) {
         System.out.println("SUNDAY");
      } else {
         System.out.println("NOT A VALID DAY");
      }
   }

}
