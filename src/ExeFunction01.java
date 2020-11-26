import java.util.Random;

public class ExeFunction01 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(10) + 1;
            System.out.println(num);
            System.out.println(maxFind(num));
        }
    }

    public static int maxFind(int num){
        int max = num;
            if (num >= max) {
                max = num;
            }
        return max;
    }
}
