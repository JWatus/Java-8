package ex_21;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        ZoneId zone = ZoneId.of("Australia/Sydney");
        ZonedDateTime definedDateTime =
                ZonedDateTime.of(1992,7,15,15,30,00,00,zone);

        System.out.println(definedDateTime.toString());

    }

}
