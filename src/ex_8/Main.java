package ex_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

        public static void main(String[] args) {

            List<String> list = new ArrayList<>(Arrays.asList("","One","","","Two","Three","Four","Five"));

            list.forEach(System.out::println);
            // jest to jednoznaczne z :

            list.forEach(s -> System.out.println(s));
            // co jest jednoznaczne z :

            list.forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.println(s);
                }
            });




            List <String> result = new ArrayList<>();

            list.forEach(result::add);

            list.forEach(s -> result.add(s));



        }
}
