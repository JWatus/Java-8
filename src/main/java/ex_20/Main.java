package ex_20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDate definedDate = LocalDate.of(2018, 2, 14);
        LocalTime definedTime = LocalTime.of(12, 15, 15);

        LocalDateTime definedDateTime = LocalDateTime.of(2018, Month.MAY,15,10, 00, 00);
        LocalDateTime definedDateTimeTwo = LocalDateTime.of(definedDate,definedTime);

        System.out.println("Hour: " + definedDateTimeTwo.getHour());
        System.out.println("Minute: " + definedDateTimeTwo.getMinute());
        System.out.println("Second: " + definedDateTimeTwo.getSecond());
        System.out.println();
        System.out.println("Day: " + definedDateTimeTwo.getDayOfMonth());
        System.out.println("Month: " + definedDateTimeTwo.getMonth());
        System.out.println("Year: " + definedDateTimeTwo.getYear());
        System.out.println();
        System.out.println("///////////////////////////////////////////");
        System.out.println();
        System.out.println("Hour: " + definedDateTime.getHour());
        System.out.println("Minute: " + definedDateTime.getMinute());
        System.out.println("Second: " + definedDateTime.getSecond());
        System.out.println();
        System.out.println("Day: " + definedDateTime.getDayOfMonth());
        System.out.println("Month: " + definedDateTime.getMonth());
        System.out.println("Year: " + definedDateTime.getYear());
        System.out.println();
        System.out.println("///////////////////////////////////////////");
        System.out.println();

        System.out.println(definedDateTime.toString());
        System.out.println();
        System.out.println("///////////////////////////////////////////");
        System.out.println();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy - HH:mm");
        System.out.println(LocalTime.parse("15 07 1992 - 05:45", dtf));

    }

}
