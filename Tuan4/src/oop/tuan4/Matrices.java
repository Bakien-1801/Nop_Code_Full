package oop.tuan4;

import java.util.Random;

public class Matrices {
   public static void createRandomMatrix(int[][] matrix) {
      // check null
      if (matrix == null) {
         return;
      }
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = (int) (Math.random() * 100);
         }
      }

   }

   public static int[][] createRandomMatrix(int rows, int cols) {
      int[][] matrix = new int[rows][cols];

      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            matrix[i][j] = (int) (Math.random() * 100);
         }
      }
      return matrix;
   }

   public static void print(int[][] matrix) {
      if (matrix == null) {
         return;
      }
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[0].length; j++) {
            System.out.printf("%4d", matrix[i][j]);
         }
         System.out.println();
      }

   }

   public static void print(double[][] matrix) {
      if (matrix == null) {
         return;
      }
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[0].length; j++) {
            System.out.printf("%4.2f", matrix[i][j]);
         }
         System.out.println();
      }
   }

   // Used in add(), subtract()
   public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
      if (matrix1 == null || matrix2 == null) {
         return false;
      }
      if (matrix1.length != matrix2.length) {
         return false;
      } else {
         return matrix1[0].length == matrix2[0].length;
      }
   }

   public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
      if (matrix1 == null || matrix2 == null) {
         return false;
      }
      if (matrix1.length != matrix2.length) {
         return false;
      } else {
         return matrix1[0].length == matrix2[0].length;
      }
   }

   public static int[][] add(int[][] matrix1, int[][] matrix2) {
      if (!haveSameDimension(matrix1, matrix2)) {
         return null;
      }
      int[][] matrix3 = new int[matrix1.length][matrix1[0].length];
      for (int i = 0; i < matrix1.length; i++) {
         for (int j = 0; j < matrix2.length; j++) {
            matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }
      return matrix3;
   }

   public static double[][] add(double[][] matrix1, double[][] matrix2) {
      if (!haveSameDimension(matrix1, matrix2)) {
         return null;
      }
      double[][] matrix3 = new double[matrix1.length][matrix1[0].length];
      for (int i = 0; i < matrix1.length; i++) {
         for (int j = 0; j < matrix2.length; j++) {
            matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }
      return matrix3;
   }

   public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
      if (!haveSameDimension(matrix1, matrix2)) {
         return null;
      }
      int[][] matrix3 = new int[matrix1.length][matrix1[0].length];
      for (int i = 0; i < matrix1.length; i++) {
         for (int j = 0; j < matrix2.length; j++) {
            matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
         }
      }
      return matrix3;
   }

   public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
      if (!haveSameDimension(matrix1, matrix2)) {
         return null;
      }
      double[][] matrix3 = new double[matrix1.length][matrix1[0].length];
      for (int i = 0; i < matrix1.length; i++) {
         for (int j = 0; j < matrix2.length; j++) {
            matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
         }
      }
      return matrix3;
   }

   public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
      if (matrix1[0].length != matrix2.length) {
         return null;
      }
      int[][] matrix3 = new int[matrix1.length][matrix2[0].length];
      for (int i = 0; i < matrix1.length; i++) {
         for (int j = 0; j < matrix2[0].length; j++) {
            matrix3[i][j] = 0;
            for (int k = 0; k < matrix1[0].length; k++) {
               matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
            }
         }
      }
      return matrix3;
   }

   public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
      if (matrix1[0].length != matrix2.length) {
         return null;
      }
      double[][] matrix3 = new double[matrix1.length][matrix2[0].length];
      for (int i = 0; i < matrix1.length; i++) {
         for (int j = 0; j < matrix2[0].length; j++) {
            matrix3[i][j] = 0;
            for (int k = 0; k < matrix1[0].length; k++) {
               matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
            }
         }
      }
      return matrix3;
   }

   public static void main(String[] args) {
      Random generator = new Random();
      int[][] matrix1 = { { generator.nextInt(10), generator.nextInt(10), generator.nextInt(10) },
            { generator.nextInt(10), generator.nextInt(10), generator.nextInt(10) },
            { generator.nextInt(10), generator.nextInt(10), generator.nextInt(10) } };
      int[][] matrix2 = { { generator.nextInt(10), generator.nextInt(10), generator.nextInt(10) },
            { generator.nextInt(10), generator.nextInt(10), generator.nextInt(10) },
            { generator.nextInt(10), generator.nextInt(10), generator.nextInt(10) } };
      int[][] matrix3 = { { generator.nextInt(10), generator.nextInt(10), generator.nextInt(10) },
            { generator.nextInt(10), generator.nextInt(10), generator.nextInt(10) }, };
      print(matrix1);
      System.out.println();
      print(matrix2);
      System.out.println();
      print(matrix3);
      System.out.println();
      System.out.println(haveSameDimension(matrix1, matrix2));
      System.out.println(haveSameDimension(matrix1, matrix3));
      System.out.println();
      int[][] matrix4 = add(matrix1, matrix2);
      int[][] matrix5 = subtract(matrix1, matrix2);
      int[][] matrix6 = multiply(matrix1, matrix2);
      print(matrix4);
      System.out.println();
      print(matrix5);
      System.out.println();
      print(matrix6);
      System.out.println();

      double[][] matrix7 = { { generator.nextDouble(), generator.nextDouble(), generator.nextDouble() },
            { generator.nextDouble(), generator.nextDouble(), generator.nextDouble() },
            { generator.nextDouble(), generator.nextDouble(), generator.nextDouble() } };
      double[][] matrix8 = { { generator.nextDouble(), generator.nextDouble(), generator.nextDouble() },
            { generator.nextDouble(), generator.nextDouble(), generator.nextDouble() },
            { generator.nextDouble(), generator.nextDouble(), generator.nextDouble() } };
      double[][] matrix9 = { { generator.nextDouble(), generator.nextDouble(), generator.nextDouble() },
            { generator.nextDouble(), generator.nextDouble(), generator.nextDouble() }, };
      print(matrix7);
      System.out.println();
      print(matrix8);
      System.out.println();
      print(matrix9);
      System.out.println();
      System.out.println(haveSameDimension(matrix7, matrix8));
      System.out.println(haveSameDimension(matrix7, matrix9));
      System.out.println();
      double[][] matrix10 = add(matrix7, matrix8);
      double[][] matrix11 = subtract(matrix7, matrix8);
      double[][] matrix12 = multiply(matrix7, matrix8);
      print(matrix10);
      System.out.println();
      print(matrix11);
      System.out.println();
      print(matrix12);
      System.out.println();
   }

}
