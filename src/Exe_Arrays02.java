import java.util.Arrays;
import java.util.Random;

        // Reverse array
public class Exe_Arrays02 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        int j = 1;
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i]; //1
            arr[i] = arr[arr.length - j]; // 2
            arr[arr.length - j] = temp; // 3
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
