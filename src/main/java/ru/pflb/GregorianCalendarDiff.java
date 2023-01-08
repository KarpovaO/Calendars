package ru.pflb;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class GregorianCalendarDiff {
    public static long calculateDifferenceGregorianCalendar(Calendar calendar2) {
        Calendar calendar1 = GregorianCalendar.getInstance();
        long diff = ChronoUnit.DAYS.between(calendar1.toInstant(), calendar2.toInstant());
        return diff;
    }
}
