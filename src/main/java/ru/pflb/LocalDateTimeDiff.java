package ru.pflb;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public final class LocalDateTimeDiff {
    public static long calculateDifferenceLocalDateTime(LocalDateTime dateTime) {
        LocalDateTime dateTime2 = LocalDateTime.now();
        long diff = ChronoUnit.DAYS.between(dateTime2, dateTime);
        return diff;
    }


}
