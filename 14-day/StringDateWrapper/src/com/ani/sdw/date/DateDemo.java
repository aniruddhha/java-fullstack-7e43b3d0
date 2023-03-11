package com.ani.sdw.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo {
    
    public void demo1() {

        System.out.print("👉 LocalDate: ");
        LocalDate today = LocalDate.now();
        System.out.println(today.toString());

        System.out.print("👉 LocalTime: ");
        LocalTime time = LocalTime.now();
        System.out.println(time.toString());

        System.out.print("👉 LocDatealTime: ");
        LocalDateTime tdTm = LocalDateTime.now();
        System.out.println(tdTm.toString());
    }

    public void demo2() {
        LocalDate date = LocalDate.of(2022, 01, 01 );
        LocalDate later = date.plusDays(10);
        System.out.print("👉 Original: ");
        System.out.println(date);
        System.out.print("👉 10 Days Later: ");
        System.out.println(later);
    }
}
