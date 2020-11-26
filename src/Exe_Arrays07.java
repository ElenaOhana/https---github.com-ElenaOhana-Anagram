import java.util.Scanner;

public class Exe_Arrays07 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int firstColumn = 0;
        int secondColumn = 0;
        int lastColumn = 0;
        int firstRow = 0;
        int secondRow = 0;
        int lastRow = 0;
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 9 numbers to matrix please ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        //Print Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            firstColumn = firstColumn + matrix[i][0];
            secondColumn = secondColumn + matrix[i][1];
            lastColumn = lastColumn + matrix[i][matrix.length - 1];
        }
        for (int j = 0; j < matrix.length; j++) {
            firstRow = firstRow + matrix[0][j];
            secondRow = secondRow + matrix[1][j];
            lastRow = lastRow + matrix[matrix.length - 1][j];
        }
        firstDiagonal = firstDiagonal + (matrix[0][0] + matrix[1][1] + matrix[2][2]);
        secondDiagonal = secondDiagonal + (matrix[2][0] + matrix[1][1] + matrix[0][2]);
        /*System.out.println(firstColumn + " " + secondColumn + " " + lastColumn + " " + firstRow + " " + secondRow + " " + lastRow + " " + firstDiagonal +
                " " + secondDiagonal);*/
        if (firstColumn == secondColumn && firstColumn == lastColumn) {
            if (lastColumn == firstRow && firstRow == secondRow) {
                if (secondRow == lastRow && lastRow == firstDiagonal) {
                    if (firstDiagonal == secondDiagonal) {
                        System.out.println("It's a Magic Square!");
                    }
                }
            }
        }
    }
}
