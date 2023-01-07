package ru.pflb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDiff {
    LocalDate date2 = LocalDate.now();

    public long calculateDifferenceLocalDate(LocalDate date) {
        long diff = ChronoUnit.DAYS.between(date2, date);
        return diff;
    }
}

