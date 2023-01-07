package ru.pflb;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDiff {
    LocalDateTime dateTime2 = LocalDateTime.now();

    public long calculateDifferenceLocalDateTime(LocalDateTime dateTime) {
        long diff = ChronoUnit.DAYS.between(dateTime2, dateTime);
        return diff;
    }


}
