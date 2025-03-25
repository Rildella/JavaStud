import java.util.Random;
import java.util.Scanner;

public class MatrixProcessor {
    private static final int MAX_SIZE = 20;
    private static final int MIN_VALUE = -50;
    private static final int MAX_VALUE = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть висоту матриці (не більше 20): ");
        int rows = scanner.nextInt();
        System.out.print("Введіть ширину матриці (не більше 20): ");
        int cols = scanner.nextInt();

        if (rows > MAX_SIZE || cols > MAX_SIZE) {
            System.out.println("Розмір перевищує 20x20!");
            return;
        }

        int[][] matrix = new int[rows][cols];

        System.out.print("Створити матрицю (1 - вручну, 2 - випадково): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введіть елементи матриці:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        } else {
            Random rand = new Random();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = rand.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
                }
            }
        }

        printMatrix(matrix);
        analyzeMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    private static void analyzeMatrix(int[][] matrix) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        double sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) min = num;
                if (num > max) max = num;
                sum += num;
                count++;
            }
        }

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + (sum / count));
    }
}
