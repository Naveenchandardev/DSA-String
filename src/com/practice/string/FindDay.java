package com.practice.string;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FindDay {
    public static void main(String[] args) {
        LocalDate givenDate = LocalDate.of(2024, 1, 1); // Assuming January 1, 2024 as the given date
        DayOfWeek dayOfWeek = givenDate.getDayOfWeek();
        System.out.println("Day of the week for the given date is: " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        LocalDate newDate = givenDate.plusDays(200);
        System.out.println("200th day after the given date is: " + newDate);
    }
}
