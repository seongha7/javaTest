package com.example.javatest;
import java.util.LinkedList;


public class Example {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        //add 메서드 사용
        animals.add("puppy");
        animals.add("cat");
        animals.add(0, "eagle");
        animals.add("rabbit");
        //set 메서드 사용 (수정)
        animals.set(1, "student");
        //pop 메서드 사용 (0번째 항목 제거)
        animals.pop();
        //remove 메서드 사용 
        animals.remove(2);

        System.out.println(animals);
    }
}


