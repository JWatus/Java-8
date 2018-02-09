package ex_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("","One","","","Two","Three","Four","Five"));

        list.removeIf( (String s) -> s.isEmpty());                             // Parametrem jest Predicate

        list.forEach( (String s) -> System.out.println(s.toUpperCase()));      // Parametrem jest Consumer

    }
}
