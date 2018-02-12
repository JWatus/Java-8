package ex_23;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

     /*   Clock clock = Clock.systemDefaultZone();
        long start = clock.millis();

        for (int i = 0; i < 10000; i++) {
            double d = Math.sqrt(Math.abs(Math.sin(i)*Math.tan(i)*new Random().nextGaussian()));
            System.out.println(d);
        }

        long stop = clock.millis();

        System.out.println("Czas operacji: "+(stop-start));*/

        System.out.println();

        Instant startTwo = Instant.now();

        for (int i = 0; i < 10000; i++) {
            double d = Math.sqrt(Math.abs(Math.sin(i)*Math.tan(i)*new Random().nextGaussian()));
            System.out.println(d);
        }

        Instant stopTwo = Instant.now();
        System.out.println("Czas operacji: "+ChronoUnit.MILLIS.between(startTwo,stopTwo)+ " ms");

    }
}
