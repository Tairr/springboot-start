package com.videonet;


import java.util.Calendar;
import java.util.Locale;

/**
 * Created by tangjinhui on 2017/10/30.
 */
public class TestModel {

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance(Locale.CHINA);
        date.setFirstDayOfWeek(Calendar.MONDAY);
        date.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
        System.out.println((date.getTime()));
        date.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
        System.out.println((date.getTime()));
    }

}
