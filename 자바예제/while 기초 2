package com.example.javatest;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean card = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("합을 구할 숫자를 입력하세요.(끝내려면 0을 입력)");
        
        while (card) {
            System.out.print(">>");
            
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);
            
            if (num != 0) {
                sum += num;
            } else {
                card = false;
            }
        }
        System.out.println("합:"+ sum);
    } 
}
