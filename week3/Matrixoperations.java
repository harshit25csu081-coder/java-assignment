import java.util.Scanner;

public class Matrixoperations {

    static int[] rowSums(int[][] matrix) {
        int rows = matrix.length;
        int[] result = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i] += matrix[i][j];
            }
        }
        return result;
    }

    static int[] columnSums(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;
        int[] result = new int[column];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                result[j] += matrix[i][j];
            }
        }
        return result;
    }

    static int[][] add(int[][] first, int[][] second) {
        if (first.length != second.length ||
            first[0].length != second[0].length) {

            System.out.println("Matrix cannot be added");
            return null;
        }

        int[][] result = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }

        return result;
    }

    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    static int[][] multiply(int[][] first, int[][] second) {
        if (first[0].length != second.length) {
            System.out.println("Matrix cannot be multiplied");
            return null;
        }

        int[][] result = new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < second.length; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},{4, 5, 6} };
        int[][] b = {
            {7, 8}, {9, 10},{11, 12} };
        System.out.println("Matrix A:");
        printMatrix(a);
        System.out.println("Transpose:");
        printMatrix(transpose(a));
        System.out.println("Multiplication:");
        printMatrix(multiply(a, b));
    }
}
