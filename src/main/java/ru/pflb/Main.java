package ru.pflb;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


import static java.time.format.DateTimeFormatter.*;

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Date birthdayDate = new Date(83, 6, 16, 05, 40, 0);
        DateDiff dateBirthday = new DateDiff();

        System.out.println("Date: ");
        System.out.println(birthdayDate);
        System.out.println(new SimpleDateFormat("HH-mm dd-MM-yyyy").format(birthdayDate));
        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(birthdayDate));
        System.out.println(new SimpleDateFormat("yyyy-MMMM-dd").format(birthdayDate));
        System.out.println(new SimpleDateFormat("yyyy-dd-MMMM-HH-mm-ss").format(birthdayDate));

        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Скорость выполнения программы Date: " + timeWorkCode + " миллисекунд");
        System.out.println("Разница с текущей датой " + dateBirthday.calculateDifferenceDays(birthdayDate)  +  " дн.");
        System.out.println("---------------------------------------------------");


        long start2 = System.currentTimeMillis();
        LocalDate date = LocalDate.of(1983, 07, 16);
        LocalDateDiff localDateDiff = new LocalDateDiff();

        System.out.println("LocalDate: ");
        System.out.println(date);
        System.out.println(DateTimeFormatter.ofPattern("dd MMM yyyy").format(date));
        System.out.println(BASIC_ISO_DATE.format(date));
        System.out.println(ISO_LOCAL_DATE.format(date));
        System.out.println(ISO_ORDINAL_DATE.format(date));
        System.out.println("Разница с текущей датой " + localDateDiff.calculateDifferenceLocalDate(date) +  " дн.");

        long timeWorkCode2 = System.currentTimeMillis() - start2;
        System.out.println("---------------------------------------------------");

        long start3 = System.currentTimeMillis();
        LocalDateTime dateTime = LocalDateTime.of(1983, 07, 16,05,40,01);
        LocalDateTimeDiff localDateTimeDiff = new LocalDateTimeDiff();

        System.out.println("LocalDateTime: ");
        System.out.println(dateTime);
        System.out.println(DateTimeFormatter.ofPattern("dd MMM yyyy HH mm ss").format(dateTime));
        System.out.println(ISO_LOCAL_DATE_TIME.format(dateTime));
        System.out.println(ISO_WEEK_DATE.format(dateTime));
        System.out.println(ISO_TIME.format(dateTime));
        System.out.println("Разница с текущей датой " + localDateTimeDiff.calculateDifferenceLocalDateTime(dateTime) +  " дн.");

        long timeWorkCode3 = System.currentTimeMillis() - start3;



        System.out.println("---------------------------------------------------");

        long start4 = System.currentTimeMillis();
        ZonedDateTimeDiff zonedDateTimeDiff = new ZonedDateTimeDiff();

        System.out.println("ZonedDateTime: ");
        ZoneId zone = ZoneId.of("Europe/Moscow" );
        ZonedDateTime zonedDT = ZonedDateTime.of(dateTime, zone);
        System.out.println(zonedDT);
       System.out.println("Разница с текущей датой " + zonedDateTimeDiff.calculateDifferenceZonedDateTime(zonedDT) +  " дн.");

        long timeWorkCode4 = System.currentTimeMillis() - start4;
        System.out.println("---------------------------------------------------");


        long start5 = System.currentTimeMillis();
        Calendar calendar = new GregorianCalendar(1983,06,16,05,40);
        Calendar calendar2 = new GregorianCalendar(1983,06,16);
        GregorianCalendarDiff gregorianCalendarDiff = new GregorianCalendarDiff();

        System.out.println("GregorianCalendar: ");
        System.out.println(calendar.getTime());
        System.out.println(calendar2.getTime());
        System.out.println("Разница с текущей датой " + gregorianCalendarDiff.calculateDifferenceGregorianCalendar(calendar2));

        long timeWorkCode5 = System.currentTimeMillis() - start5;
        System.out.println("---------------------------------------------------");

        System.out.println("Скорость выполнения программы Date: " + timeWorkCode + " миллисекунд");
        System.out.println("Скорость выполнения программы LocalDate: " + timeWorkCode2 + " миллисекунд");
        System.out.println("Скорость выполнения программы LocalDateTime: " + timeWorkCode3 + " миллисекунд");
        System.out.println("Скорость выполнения программы LZonedDateTime: " + timeWorkCode4 + " миллисекунд");
        System.out.println("Скорость выполнения программы GregorianCalendar: " + timeWorkCode5 + " миллисекунд");

    }
}


