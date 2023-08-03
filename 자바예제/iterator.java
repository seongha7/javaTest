package com.example.javatest;
import java.util.*;


 class Example {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
