import java.util.Random;

public class Exe10 {
    public static void main(String[] args) {
        int mult = 0;
        Random random = new Random();
        int a = random.nextInt(20) + 1;
        int b = random.nextInt(20) + 1;
        for ( int i = b; i > 0; i--) {
            mult = mult + a;
        }
        System.out.println("The multiplication of " + a + " and " + b + " is " + mult);
    }
}
