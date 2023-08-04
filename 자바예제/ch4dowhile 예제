package com.example.javatest;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100 사이의 정수를 입력하세요 >");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작습니다");
            } else if (input < answer) {
                System.out.println("더 큽니다");
            }
        } while (input != answer);

        System.out.println("정답입니다");
    }
}
