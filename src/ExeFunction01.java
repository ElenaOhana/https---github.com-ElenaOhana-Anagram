import java.util.Random;

public class ExeFunction01 {
    public static void main(String[] args) {
        Random random = new Random();
        int num;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            num = random.nextInt(10) + 1;
            System.out.print(num + " ");
            max = maxFind(num, max);
        }
        System.out.println("\nThe maximum value is " + max);
    }

    public static int maxFind(int num, int max) {
        if (num > max) {
            max = num;
        }
        return max;
    }
}
