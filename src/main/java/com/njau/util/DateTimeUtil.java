package com.njau.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateTimeUtil
 *
 * @since 2022/04/21.
 */
public class DateTimeUtil {
    public static String parse(Date date, String format) {
        if (date == null) {
            return "-";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    public static String parse(Date date) {
        return parse(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static Date string2Date(String date) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
    }
    public static String getNowDateString() {
        return parse(new Date());
    }
}
