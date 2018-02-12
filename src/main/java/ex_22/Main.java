package ex_22;

import java.time.*;

public class Main {

    public static void main(String[] args) {

        LocalDate atStart = LocalDate.of(2018,01,23);
        LocalDate atEnd = LocalDate.of(2018,03,26);
        LocalDate today = LocalDate.now();
        Period period = Period.between(atStart,today);
        System.out.println(period);
        System.out.println("Number of days: "+ period.getDays());

    }
}
