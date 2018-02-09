package ex_7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        minMax();

    }

    public static void minMax() {

        System.out.println("MAX:");

        getResult(Arrays.asList(100, 128, 512, 320, 0, -40),            // (lista, funkcja, int)

                integers -> {

                    Integer max = Integer.MIN_VALUE;

                    for (Integer i : integers) {
                        if (i > max) {
                            max = i;
                        }
                    }

                    return max;
                },
                i -> System.out.println(i));

        System.out.println();

        System.out.println("MIN");

        getResult(Arrays.asList(100, 128, 512, 320, 0, -40),

                ints -> {
                    Integer min = Integer.MAX_VALUE;

                    for (Integer i : ints) {
                        if (i < min) {
                            min = i;
                        }
                    }

                    return min;
                },

                i -> System.out.println(i));
    }

    public static void getResult(List<Integer> ints, Function<List<Integer>, Integer> f, Consumer<Integer> c) {

        Integer result = f.apply(ints);
        c.accept(result);
    }

    public static void runTask(Runnable runnable) {
        runnable.run();
    }
}