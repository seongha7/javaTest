package com.example.javatest;

public class Example {
    public static void main(String[] args) {
        int [] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
            int tmp = 0; // i 와 j 두 값을 바꾸는데 사용할 임시변수
            int j = 0; // 랜덤값(45까지) 얻어서 저장할 변수

            for (int i = 0; i < 6; i++) {
                j = (int) (Math.random() * 45);
                tmp = ball[i];
                ball[i] = ball[j];
                ball[j] = tmp;
            }

            for (int i = 0; i < 6; i++) {
                System.out.printf("ball[%d]=%d%n", i, ball[i]);
            }
        }
    }
