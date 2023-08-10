package com.example.javatest;
import java.util.*;

class LambdaEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }

        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        list.removeIf(x -> x%3 == 0 || x%4 ==0);
        System.out.println(list);

        list.replaceAll(i -> i * 20);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((k,v) -> System.out.print("{"+k+","+v+"},"));
        System.out.println();

    }
}

