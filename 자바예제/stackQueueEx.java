package com.example.javatest;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack; // 묶어서 java.util.*으로 처리 가능

 class Example {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while (!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("= queue =");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }

}
