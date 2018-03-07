package ex_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("","One","","","Two","Three","Four","Five"));

        Function<List<String>, List<Integer>> lengthsOne = list -> {
            List<Integer> result = new ArrayList<>();
            list.forEach( s -> result.add(s.length()));
            return result;
        };

        System.out.println(lengthsOne.apply(strings));
/*
        Function<List<String>, List<Integer>> lengthsTwo = new Function<List<String>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<String> list) {
                List<Integer> result = new ArrayList<>();
                list.forEach( s -> result.add(s.length()));
                return result;
            }
        };

*/
        Function<String, Integer> fOne = s -> s.length();
        int lengthOne = fOne.apply("abcdefgijk");

/*        Function<String, Integer> f = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        int length = f.apply("abcdefgijk");*/
    }
}
