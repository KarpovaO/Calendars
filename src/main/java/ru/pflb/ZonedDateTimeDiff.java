package ru.pflb;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeDiff {
    LocalDateTime ldt = LocalDateTime.now();
    ZonedDateTime now2 = ldt.atZone(ZoneId.of("Europe/Moscow"));

    public long calculateDifferenceZonedDateTime(ZonedDateTime zonedDT) {
        long diff = ChronoUnit.DAYS.between(now2, zonedDT);
        return diff;
    }

}
