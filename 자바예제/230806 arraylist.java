package com.example.javatest;
import java.util.ArrayList;

class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add(0, "blue");//0번째 추가, 나머지는 뒤로 밀림
        colors.add("red");
        colors.set(0, "green"); //0번째 변경 blue -> green

        System.out.println(colors);
    }
}
