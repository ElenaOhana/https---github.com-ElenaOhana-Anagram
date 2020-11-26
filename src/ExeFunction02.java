import java.util.Random;

public class ExeFunction02 {
    public static void main(String[] args) {
        Random rand = new Random();
        sumOf10RandomPrint(rand);
    }

    private static void sumOf10RandomPrint(Random random) {
        int count = 0;
        int sum = 0;
        while (count < 10) {
            int num = random.nextInt(10) + 1;
            sum = sum + num;
            count++;
            System.out.println("Random numbers are " + num + " ");
        }
        System.out.println("The sum is " + sum);
    }
}
