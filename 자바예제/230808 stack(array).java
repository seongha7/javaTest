package com.example.javatest;


class Stack{
    int arr[];
    int top;
    int capacity;

    // 스택 초기화를 위한 생성자
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // 스택에 요소 x를 추가하는 함수
    void push(int x) {
        if (isFull()) {
            System.out.println("overflow\nprogram terminated\n");
            System.exit(-1);
        }
        System.out.println("inserting " + x);
        arr[++top] = x;
    }

    // 스택에서 최상위 요소를 꺼내는 함수
    int pop() {
        if (isEmpty()) {
            System.out.println("underflow\nprogram terminated");
            System.exit(-1);
        }
        System.out.println("removing " + peek());
        return arr[top--];
    }

    // 스택에서 최상위 요소를 반환하는 함수
    int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }
        return -1;
    }
    // 스택ㄱ의 크기를 반환
    int size() {
        return top +1;
    }
    // 비어있는지 확인
    boolean isEmpty() {
        return top == -1;
    }
    // 꽉 찼는지 확인
    boolean isFull() {
        return top == capacity -1;
    }
}

class Main{
    public static void main(String[] args) {
        Stack stack = new Stack(3);

         stack.push(1); // 추가
         stack.push(2);

         stack.pop(); // 상단 요소 제거
         stack.pop();

         stack.push(3);

        System.out.println("the top element is " + stack.peek());
        System.out.println("the stack size is " + stack.size());

        stack.pop();

        if (stack.isEmpty()) {
            System.out.println("the stack is empty");
        } else {
            System.out.println("the stack is not empty");
        }
    }
}
