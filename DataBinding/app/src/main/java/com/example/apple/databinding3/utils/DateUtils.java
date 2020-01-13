package com.example.apple.databinding3.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by Apple on 6/20/2017.
 */

public class DateUtils {
    private static final DateFormat DATE = DateFormat.getDateInstance();
    public static String formDate(Date date){
        return DATE.format(date);
    }
    public static Date parseDate(String dateString){
        try {
            return DATE.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
