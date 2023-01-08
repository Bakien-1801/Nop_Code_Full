package hw3;

import java.util.Scanner;

public class GradesHistogram {
   public static int[] grades;

   public static void main(String[] args) {
      readGrades();
      System.out.println();

      int[] statisticalTables = new int[10];
      for (int i = 0; i < statisticalTables.length; i++) {
         statisticalTables[i] = 0;
      }
      for (int i = 0; i < grades.length; i++) {
         if (grades[i] <= 9) {
            statisticalTables[0]++;
         } else if (grades[i] <= 19) {
            statisticalTables[1]++;
         } else if (grades[i] <= 29) {
            statisticalTables[2]++;
         } else if (grades[i] <= 39) {
            statisticalTables[3]++;
         } else if (grades[i] <= 49) {
            statisticalTables[4]++;
         } else if (grades[i] <= 59) {
            statisticalTables[5]++;
         } else if (grades[i] <= 69) {
            statisticalTables[6]++;
         } else if (grades[i] <= 79) {
            statisticalTables[7]++;
         } else if (grades[i] <= 89) {
            statisticalTables[8]++;
         } else {
            statisticalTables[9]++;
         }
      }

      for (int i = 0; i < statisticalTables.length; i++) {
         switch (i) {
            case 0:
               System.out.print(" 0 -   9: ");
               for (int j = 0; j < statisticalTables[i]; j++) {
                  System.out.print("*");
               }
               System.out.println();
               break;
            case 1:
               System.out.print("10 -  19: ");
               for (int j = 0; j < statisticalTables[i]; j++) {
                  System.out.print("*");
               }
               System.out.println();
               break;
            case 2:
               System.out.print("20 -  29: ");
               for (int j = 0; j < statisticalTables[i]; j++) {
                  System.out.print("*");
               }
               System.out.println();
               break;
            case 3:
               System.out.print("30 -  39: ");
               for (int j = 0; j < statisticalTables[i]; j++) {
                  System.out.print("*");
               }
               System.out.println();
               break;
            case 4:
               System.out.print("40 -  49: ");
               for (int j = 0; j < statisticalTables[i]; j++) {
                  System.out.print("*");
               }
               System.out.println();
               break;
            case 5:
               System.out.print("50 -  59: ");
               for (int j = 0; j < statisticalTables[i]; j++) {
                  System.out.print("*");
               }
               System.out.println();
               break;
            case 6:
               System.out.print("60 -  69: ");
               for (int j = 0; j < statisticalTables[i]; j++) {
                  System.out.print("*");
               }
               System.out.println();
               break;
            case 7:
               System.out.print("70 -  79: ");
               for (int j = 0; j < statisticalTables[i]; j++) {
                  System.out.print("*");
               }
               System.out.println();
               break;
            case 8:
               System.out.print("80 -  89: ");
               for (int j = 0; j < statisticalTables[i]; j++) {
                  System.out.print("*");
               }
               System.out.println();
               break;
            default:
               System.out.print("90 - 100: ");
               for (int j = 0; j < statisticalTables[i]; j++) {
                  System.out.print("*");
               }
               System.out.println();

         }
      }
      System.out.println();

      int max = -1;
      for (int i = 0; i < statisticalTables.length; i++) {
         if (max < statisticalTables[i]) {
            max = statisticalTables[i];
         }
      }

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

}
