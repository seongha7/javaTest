package com.example.javatest;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        int num = 0;
        System.out.print("*을 출력할 라인의 수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String star = scanner.nextLine();
        num = Integer.parseInt(star);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
