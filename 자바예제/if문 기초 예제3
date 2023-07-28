package com.example.javatest;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', detail = ' ';

        System.out.println("점수를 입력하세요 ->");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
            if (score >= 95){
                 detail = '+';
            } else if (score <95) {
                detail = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 87) {
                detail = '+';
            } else if (score < 87) {
                detail = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.printf("학점은 %c%c입니다.%n", grade, detail);
    }
}
