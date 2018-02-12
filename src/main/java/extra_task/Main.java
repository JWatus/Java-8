package extra_task;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {


        // local date time
        LocalDateTime localDateTime = LocalDateTime
                .of(2025, 3, 1, 23, 15, 0)
                .with(TemporalAdjusters.dayOfWeekInMonth(5, DayOfWeek.SATURDAY));
        System.out.println(localDateTime);
        // -> zoned date time
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,
                ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        // +3hr
        System.out.println("+3 hours");
        // co dostajemy?
        System.out.println(zonedDateTime.plusHours(3));

    }
}

// TEST zwrocic uwage :
// operacje koncowe i posrednie,
// nie moge new local date,
// streamy nie modyfikuja zrodla,
// forEach a peek - forEach koncowy