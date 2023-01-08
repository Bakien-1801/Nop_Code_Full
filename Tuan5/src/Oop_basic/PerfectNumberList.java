package Oop_basic;

import java.util.Scanner;

public class PerfectNumberList {
   public static boolean isPerfect(int n) {
      int sum = 0;
      for (int i = 1; i <= n / 2; i++) {
         if (n % i == 0) {
            sum += i;
         }
      }
      return sum == n;
   }

   public static boolean isDeficient(int n) {
      int sum = 0;
      for (int i = 1; i <= n / 2; i++) {
         if (n % i == 0) {
            sum += i;
         }
      }
      return sum < n;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the upper bound: ");
      int n = sc.nextInt();
      System.out.println("These numbers are perfect: ");
      int count = 0;
      for (int i = 1; i <= n; i++) {
         if (isPerfect(i)) {
            System.out.print(i + " ");
            count++;
         }
      }
      System.out.printf("\n%d perfect numbers found (%.2f%c)", count, (double) count / n * 100, '%');
      System.out.println();
      System.out.println("These numbers are neither deficient nor perfect: ");
      count = 0;
      for (int i = 1; i <= n; i++) {
         if (!isPerfect(i) && !isDeficient(i)) {
            System.out.print(i + " ");
            count++;
         }
      }
      System.out.println();
      System.out.printf("%d numbers found (%.2f%c)", count, (double) count / n * 100, '%');
      sc.close();
   }
}
