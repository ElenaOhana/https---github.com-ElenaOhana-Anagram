import java.util.Random;

public class ExeFunction02 {
    public static void main(String[] args) {
        sumOf10RandomPrint();
    }

    private static void sumOf10RandomPrint() {
        int count = 0;
        Random random = new Random();
        int num = random.nextInt(10) + 1;
        int sum = 0;
        while (count < 10) {
            sum = 0;
            sum = sum + num;
            count++;
            System.out.println("Random numbers are " + num + " ");
        }
        System.out.println("The sum is " + sum);
    }
}
