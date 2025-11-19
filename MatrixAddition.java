import java.util.*;

public class MatrixAddition {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java MatrixAddition <order N>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int[][] matrix1 = new int[N][N];
        int[][] matrix2 = new int[N][N];
        int[][] result = new int[N][N];

        System.out.println("Enter elements for matrix 1:");
        inputMatrix(matrix1);

        System.out.println("Enter elements for matrix 2:");
        inputMatrix(matrix2);

        addMatrices(matrix1, matrix2, result);

        System.out.println("Resultant matrix after addition:");
        displayMatrix(result);
    }

    public static void inputMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] result) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
