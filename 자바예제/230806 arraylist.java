package com.example.javatest;
import java.util.ArrayList;

class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add(0, "blue");
        colors.add("red");
        colors.set(0, "green");

        System.out.println(colors);
    }
}
