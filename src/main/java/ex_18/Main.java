package ex_18;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LocalDate definedDate = LocalDate.of(2018, 2, 14);

        System.out.println(definedDate);

        Month month = definedDate.getMonth();
        int year = definedDate.getYear();
        int dayOfMonth = definedDate.getDayOfMonth();
        DayOfWeek dayOfWeek = definedDate.getDayOfWeek();

        System.out.println("Month: " + month + " Year: " + year + " Day of month: " + dayOfMonth);

        System.out.println(definedDate.toString());

        System.out.println(LocalDate.parse("2018-02-28"));

        // DD.MM.YYYY
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(definedDate.format(dtf));
    }

}
