package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics_Deviation {
   public static int[] grades;

   public static void main(String[] args) {
      readGrades(); // Read and save inputs in static int[] grades
      System.out.print("The grades are: ");
      print(grades);
      System.out.println();
      System.out.printf("The average is %.2f", average(grades));
      System.out.println();
      System.out.printf("The median is %.2f", median(grades));
      System.out.println();
      System.out.println("The minimum is " + min(grades));
      System.out.println("The maximum is " + max(grades));
      System.out.printf("The standard deviation is %.2f", stdDev(grades));
      System.out.println();
   }

   public static void readGrades() {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the number of students: ");
      int numStudents = in.nextInt();

      grades = new int[numStudents];

      int numberIn;
      boolean isValid;
      for (int i = 0; i < grades.length; ++i) {
         isValid = false;
         do {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            numberIn = in.nextInt();
            if (numberIn >= 0 && numberIn <= 100) {
               isValid = true;
            } else {
               System.out.println("Invalid input, try again...");
            }
         } while (!isValid);
         grades[i] = numberIn;
      }
      in.close();
   }

   // Print the given int array in the form of [x1, x2, x3 ... xn].
   public static void print(int[] array) {
      if (array == null) {
         System.out.print("null");
         return;
      }
      for (int i = 0; i < array.length; ++i) {
         if (i == 0) {
            System.out.print("[" + array[i]);
         } else if (i == array.length - 1) {
            System.out.print(", " + array[i] + "]");
            break;
         } else {
            System.out.print(", " + array[i]);
         }
      }
   }

   // Return the average value of the given int[]
   public static double average(int[] array) {
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
         sum += array[i];
      }
      return (double) sum / array.length;
   }

   public static double median(int[] array) {
      Arrays.sort(array);
      if (array.length % 2 != 0) {
         return array[array.length / 2];
      } else {
         return (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
      }
   }

   // Return the maximum value of the given int[]
   public static int max(int[] array) {
      int max = array[0]; // Assume that max is the first element
      // From second element, if the element is more than max, set the max to this
      // element.
      for (int i = 1; i < array.length; i++) {
         if (max < array[i]) {
            max = array[i];
         }
      }
      return max;
   }

   // Return the minimum value of the given int[]
   public static int min(int[] array) {
      int min = array[0];
      for (int i = 1; i < array.length; i++) {
         if (min > array[i]) {
            min = array[i];
         }
      }
      return min;
   }

   // Return the standard deviation of the given int[]
   public static double stdDev(int[] array) {
      double std = 0;
      double mean = average(array);
      for (int i = 0; i < array.length; i++) {
         std += (array[i]) * (array[i]) - mean * mean;
      }
      std /= array.length;
      std = Math.sqrt(std);
      return std;
   }

}
