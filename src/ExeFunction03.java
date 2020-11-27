import java.util.Random;

public class ExeFunction03 {

    public static void main(String[] args) {
        Random random = new Random();
        evenAmountCalculate(random);
    }

    public static void evenAmountCalculate(Random random) {
        int evenAmount = 0;
        int oddAmount = 0;
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(10)+1;
            System.out.print(num + " ");
            if (num % 2 == 0) {
                evenAmount++;
            } else {
                oddAmount++;
            }
        }
        System.out.println("\nAmount of odd numbers is " + oddAmount + ", amount of even numbers is " + evenAmount);
    }
}
