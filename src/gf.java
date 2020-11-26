import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class gf {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("he");
        list.add(2);
        System.out.println(list.get(0) instanceof String);
        System.out.println(list.get(1) instanceof Integer);
        boolean b = "sc" instanceof String;
        System.out.println(b);
        System.out.println("apple".compareTo("banana"));//3 // true/ false/ positive number/ negative number
        /*for (;;) {
        }*/ //infinite loop
        /*for (int i; i == 2; i++) { Loop is invalid without i initialization.
        }*/

        List names = new ArrayList<>();
        names.add("Hika");
        names.add("Oliy");
        names.add("Liza");
        names.add("Lena");
        names.add("Zoya");
        names.add("Nadya");
        //Collections.sort(names);
        //System.out.println(names);

        names.sort(Comparator.comparing(String::toString)); //todo learning
        System.out.println(names);

        //names.sort(List.DESCENDING); //??

        //names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());// ??
    }
}
