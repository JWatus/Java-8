package ex_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("","One","","","Two","Three","Four","Five"));

        list.removeIf( s -> s.isEmpty());                             // Parametrem jest Predicate

        list.forEach( s -> System.out.println(s.toUpperCase()));      // Parametrem jest Consumer

//        list.forEach(new Consumer<String>() {                                 // Powyższy zapis jest równy temu
//            @Override
//            public void accept(String s) {
//                System.out.println(s.toUpperCase());
//            }
//
//        });
    }
}
