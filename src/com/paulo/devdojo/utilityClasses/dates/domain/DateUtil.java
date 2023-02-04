package com.paulo.devdojo.utilityClasses.dates.domain;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class DateUtil {
    public static String getCalendarDate(Calendar calendar) {
        return String.format("%d/%d/%d at %d:%d:%s",
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                calendar.get(Calendar.SECOND));
    }

    public static String getCalendarDateWithLocale(Date date, int style, Locale locale) {
        return DateFormat.getDateInstance(style, locale).format(date);
    }
}
