package ex_19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalTime definedTime = LocalTime.of(12, 15, 15);

        System.out.println("Hour: " + definedTime.getHour());
        System.out.println("Minute: " + definedTime.getMinute());
        System.out.println("Second: " + definedTime.getSecond());

        System.out.println(definedTime.toString());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:ss:mm a");
        System.out.println(LocalTime.parse("00:45:05 PM", dtf));

    }

}
