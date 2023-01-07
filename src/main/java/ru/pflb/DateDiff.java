package ru.pflb;

import java.util.Date;

public class DateDiff {
    java.util.Date now = new java.util.Date();

    public int calculateDifferenceDays(Date birthdayDate) {
        long difference = now.getTime() - birthdayDate.getTime();
        int days = (int) (difference / (24 * 60 * 60 * 1000));
        return days;
    }

}
