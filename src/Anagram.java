/*javaimport java.util.Arrays;
import java.util.Scanner;
*//* Первое что приходит в голову, делаешь Map<String, List<String>> и соответственно вначале добавляется первое слово в качестве ключа,
   далее проверяется каждое следующее слово - является ли оно анаграммой каждого ключа, если подходит к какому-то ключу,
   добавляем в список значений, если нет - то добавляем новый ключ.
   Ну или List<List<>> или двумерный массив, как захочется, но удобней с Map по-поему.*//*
public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел ");
        String text = scanner.nextLine(); // cчитываем одну строку целиком
        String[] words = text.split(" "); // переводим строку в массив данных

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 1; j < words.length - 1; j++) {
                if (isReversed(words[i], words[j])) {
                    System.out.println("Слова являются анаграммами: " + words[i] + " " + words[j]);
                }
            }
        }
    }

    static boolean isReversed(String s, String s1){
        char[] charsS = s.toCharArray(); // преобразуем строку в массив символов
        char[] charsS1 = s1.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsS1);
        if (Arrays.equals(charsS, charsS1)) {                    //(charsS.equals(charsS1)){
            return true;
        }
        return false;
    }
}*/
import java.util.Arrays;

public class Anagram{
    private boolean validAnagram(String str, String pair) {
        if(str.length() != pair.length()) {
            return  false;
        }
        char[] strArr = str.toCharArray();
        char[] pairArr = pair.toCharArray();

        Arrays.sort(strArr);
        str = new String(strArr);

        Arrays.sort(pairArr);
        pair = new String(pairArr);

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != pair.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public void start() {
        boolean b = validAnagram("kakamayka", "myakakaka");
        System.out.println(b);
    }
    public static void main(String[] args) {
        Anagram anagramMethod = new Anagram();
        anagramMethod.start();
    }
}