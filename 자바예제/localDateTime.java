package com.example.javatest;
import java.time.*;

class Example {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // 오늘 날짜
        LocalTime now = LocalTime.now(); // 현재 시각

        LocalDate birthDate = LocalDate.of(2000,04,12);
        LocalTime birthTime = LocalTime.of(14,14,14);

        System.out.println("today = " + today);
        System.out.println("now = " + now);
        System.out.println("birthDate = " + birthDate);
        System.out.println("birthTime = " +birthTime);

        System.out.println(birthDate.withYear(2004));
        System.out.println(birthDate.plusDays(1));

    }
}
