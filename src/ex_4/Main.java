package ex_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("", "One", "", "", "Two", "Three", "Four", ""));

        list.removeIf( (String s) -> s.isEmpty());     // Parametrem jest Predicate
/*
        list.removeIf(new Predicate<String>() {          // Powyższy zapis jest równy temu
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        });
*/
        System.out.println(list);

        for (String a : list) {
            System.out.println(a);
        }

    }

}
