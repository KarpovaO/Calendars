package ru.pflb;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDiff {
    Calendar calendar1 = GregorianCalendar.getInstance();

    public long calculateDifferenceGregorianCalendar(Calendar calendar2) {
        long diff = ChronoUnit.DAYS.between(calendar1.toInstant(), calendar2.toInstant());
        return diff;
    }
}
