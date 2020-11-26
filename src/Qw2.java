public class Qw2 {
    public static void main(String[] args) {
        String string = "strawberries";
        String fruit = string;
        System.out.println( fruit.substring(2,5));
        //System.out.println( string.substring(2,5));

        for (int i = 0; i < 5; i=i++) { // СЕЙЧАС компилятор игнорирует i++, поэтому распечатка будет 5 раз за счет последуюзей строки.
            // Если поставить нормально: i++ (И оставить следующую строку, где i возрастает), то распечатка будет 3 раза, на i = 1, 3, 5.
            i+=1; //i = i + 1;
            System.out.println("Hell Wo");
        }
    }
}
