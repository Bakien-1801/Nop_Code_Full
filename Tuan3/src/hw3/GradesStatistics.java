package hw3;

import java.util.Scanner;

public class GradesStatistics {
   public static void main(String[] args) {
      final int numStudents;
      int[] grades;

      Scanner in = new Scanner(System.in);
      System.out.print("Enter the number of students: ");
      numStudents = in.nextInt();

      grades = new int[numStudents];

      int numberIn;
      boolean isValid;
      for (int i = 0; i < grades.length; i++) {
         isValid = false;
         do {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            numberIn = in.nextInt();
            if (numberIn >= 0 && numberIn <= 100) {
               isValid = true;
            } else {
               System.out.println("Invalid grade, please try again.");
            }
         } while (!isValid);
         grades[i] = numberIn;
      }
      in.close();

      // grades average
      int sum = 0;
      double average;
      int maximum = 0, minimum = 100;
      for (int i = 0; i < grades.length; i++) {
         sum += grades[i];
         if (grades[i] > maximum) {
            maximum = grades[i];
         }
         if (grades[i] < minimum) {
            minimum = grades[i];
         }
      }
      average = (double) sum / grades.length;
      System.out.printf("The average is: %.2f", average);
      System.out.println();
      System.out.println("The maximum is: " + maximum);
      System.out.println("The minimum is: " + minimum);
   }
}
