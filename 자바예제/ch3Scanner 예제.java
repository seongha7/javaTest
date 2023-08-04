package com.example.javatest;

import java.util.*;
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("세 자리 정수를 하나 입력하세요.");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력 :"+input);
        System.out.printf("num=%d%n", num);

    }
}
