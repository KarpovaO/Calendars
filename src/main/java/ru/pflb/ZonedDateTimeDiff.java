package ru.pflb;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public final class ZonedDateTimeDiff {
    public static long calculateDifferenceZonedDateTime(ZonedDateTime zonedDT) {
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime now2 = ldt.atZone(ZoneId.of("Europe/Moscow"));
        long diff = ChronoUnit.DAYS.between(now2, zonedDT);
        return diff;
    }

}
