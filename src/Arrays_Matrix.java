import java.util.Random;

public class Arrays_Matrix {
    public static void main(String[] args) {

        int[] array = new int[5]; // New array of size 5

        int[][] matrix1 = new int[5][10]; // Matrix of size 5 (rows) x 10 (columns)
        /*
         * This will create an array named matrix of size 5.
         * Each cell in this array is an array of ints of size 10
         */

        // Print Matrix1:
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Creates Matrix2, with each row in a different random length:
        Random random = new Random();
        int[][] matrix2 = new int[5][];
        for (int i = 0; i < matrix2.length; i++) {
            matrix2[i] = new int[random.nextInt(20)];
        }

        // Print Matrix2:
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

