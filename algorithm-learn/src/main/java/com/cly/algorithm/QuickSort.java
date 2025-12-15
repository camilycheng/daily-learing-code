package com.cly.algorithm;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @ClassName: QickSort
 * @Version: 1.0
 */
public class QuickSort {
    public static void main(String[] args){
        TimeZone utcTZ= TimeZone.getTimeZone("UTC");
        Calendar utcCal= Calendar.getInstance(utcTZ);
        utcCal.getTime();
        System.out.println(utcCal.getTime());

        Date currentUtcTime = Date.from(Instant.now());
        System.out.println(currentUtcTime);

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        String dateStr = dateformat.format(System.currentTimeMillis());
        System.out.println(dateStr);
    }
    
    
}


