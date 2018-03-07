package ex_3;

import java.util.Arrays;
import java.util.List;

public class MainOne {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 10821, 223, 232, 1, -48923, 3, 1, 34);

        MaxOperation max = new MaxOperation();
        MinOperation min = new MinOperation();

        max.calculate(list);
        min.calculate(list);

        System.out.println("Min: " + max.calculate(list) + " Max: " + min.calculate(list));
    }
}
