package ru.pflb;

import java.util.Date;

public final class DateDiff {
    public static int calculateDifferenceDays(Date birthdayDate) {
        java.util.Date now = new java.util.Date();
        long difference = now.getTime() - birthdayDate.getTime();
        int days = (int) (difference / (24 * 60 * 60 * 1000));
        return days;
    }

}
