import java.util.Random;

public class Exe11 {
    public static void main(String[] args) {
        int power = 1;
        Random random = new Random();
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;
        for ( int i = b; i > 0; i--) {
            power = power * a;
        }
        System.out.println("The power of " + a + " and " + b + " is " + power);
    }
}
