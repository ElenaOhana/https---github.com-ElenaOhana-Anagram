import java.util.Arrays;
import java.util.Scanner;

public class Exe_Arrays04 {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers to array please ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter number X please");
        int x = scanner.nextInt();

        while (x > 0) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            x--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
