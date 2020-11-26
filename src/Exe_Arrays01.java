import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exe_Arrays01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
       // Scanner scanner = new Scanner(System.in);
        String stTrue = "Yes";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (random.nextInt(100) + 1); //scanner.nextInt();// // Fill-in the array with random numbers (1-100)
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                stTrue = "No";
                break;
            }
        }
        System.out.println(stTrue);
    }
}
