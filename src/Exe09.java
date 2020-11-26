import java.util.Random;

public class Exe09 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println("Money amount is " + num);
        int tens = 0;
        int coinsOfOne = 0;
        int coinsOfFive = 0;
        //int neNum = num % 10;
        if (num == 100) {
            tens = 10;
        } else if (num >= 10) {
            tens = num / 10;
            num = num % 10;
            if (num >= 5) {
                coinsOfFive = 1;
                coinsOfOne = num - 5;
            } else {
                coinsOfOne = num;
            }
        }
        System.out.println("For this amount of money needs " + tens + " coins of 10, " + coinsOfFive + " coins of 5, " + coinsOfOne + " coins of 1 ");
    }
}
