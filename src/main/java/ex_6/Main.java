package ex_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("","One","","","Two","Three","Four","Five"));

        Function<List<String>, List<Integer>> lengths = list -> {
            List<Integer> result = new ArrayList<>();
            list.forEach( s -> result.add(s.length()));
            return result;
        };

        System.out.println(lengths.apply(strings));
    }

}
