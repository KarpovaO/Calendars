package ru.pflb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class LocalDateDiff {
    public static long calculateDifferenceLocalDate(LocalDate date) {
        LocalDate date2 = LocalDate.now();
        long diff = ChronoUnit.DAYS.between(date2, date);
        return diff;
    }
}

