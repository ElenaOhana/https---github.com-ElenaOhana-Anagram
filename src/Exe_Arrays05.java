import java.util.Random;

public class Exe_Arrays05 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();
        int firstColumn = 0;
        int lastColumn = 0;
        int firstRow = 0;
        int lastRow = 0;
        int sumOfFrameOfMatrix = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            firstColumn = firstColumn + matrix[i][0];
            lastColumn = lastColumn + matrix[i][matrix.length - 1];
        }
        System.out.println(firstColumn);
        System.out.println(lastColumn);

        for (int j = 1; j < matrix.length - 1; j++) {
            firstRow = firstRow + matrix[0][j];
            lastRow = lastRow + matrix[matrix.length - 1][j];
        }
        System.out.println(firstRow);
        System.out.println(lastRow);
        sumOfFrameOfMatrix = firstColumn + lastColumn +firstRow + lastRow;
        System.out.println();
        System.out.println("The sum of frame is " + sumOfFrameOfMatrix);
    }
}
