import java.util.Scanner;

public class MatrixMainCross {
    public static void main(String[] args) {

        System.out.println("Enter matrix size: ");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                matrix[i][k] = (int) Math.floor(Math.random() * 100);
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int k = 0; k < size; k++) {
                System.out.print(matrix[i][k] + " ");
            }
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];

        }
        System.out.println();
        System.out.println("Sum of matrix main cross is : " + sum);
    }
}