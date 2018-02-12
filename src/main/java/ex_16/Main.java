package ex_16;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "academy", "java", "junior");

        System.out.println(getNumberOfLetters(list));

    }

    public static Long getNumberOfLetters(List<String> words) {
        return words.stream()

                .flatMapToInt(a -> a.chars()) // wyciagniecie strumienia charow w postaci intow h,e,l,l,o,i,n,f,o.....o,r
                .mapToObj(i -> Character.valueOf((char)i)) // (int) -> (char)
                .distinct()
                .count();
    }
}
