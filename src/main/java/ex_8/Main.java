package ex_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

        public static void main(String[] args) {

            List<String> list = new ArrayList<>(Arrays.asList("","One","","","Two","Three","Four","Five"));

            list.forEach(System.out::println);
            // jest to jednoznaczne z :
            list.forEach(s -> System.out.println(s));

        }
}
