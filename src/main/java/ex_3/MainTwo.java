package ex_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainTwo {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(10, 10821, 223, 232, 1, -48923, 3, 1, 34);

        getResult(ints, integers -> {
                                                        // nie potrzeba tu nawet klas MaxOperation i MinOperation
            Integer i = Collections.max(integers);
            return i;
        });

        getResult(ints, integers -> {

            Integer i = Collections.min(integers);
            return i;
        });

    }

    public static void getResult(List<Integer> ints, MathOperation mathOperation) {
        Integer result = mathOperation.calculate(ints);
        System.out.println(result);

    }
}
