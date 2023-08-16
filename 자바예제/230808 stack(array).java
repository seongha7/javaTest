package com.example.javatest;



class Stack {
    int arr[];
    int top;
    int capacity;

    //초기화를 위한 생성자
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // 값을 추가하는 메서드
    void push(int x) {
        if (isFull()) {
            System.out.println("오버플로우\n프로그램을 종료합니다.\n"); // 사이즈 넘어가면 오버플로 때림
            System.exit(-1);
        }
        System.out.println("입력 " + x);
        arr[++top] = x;
    }

    // 스택에서 최상위 요소를 제거하는 메서드
    int pop() {
        if (isEmpty()) {
            System.out.println("값이 존재하지 않습니다.(underflow)\n프로그램을 종료합니다.");
            System.exit(-1);
        }
        System.out.println("삭제중 " + peek());
        return arr[top--];
    }

    // 최상단 값 반환
    int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }
        return -1;
    }

    // 크기 반환
    int size() {
        return top +1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity -1;
    }
}

class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1);
        stack.push(4);
        stack.push(2);

        stack.pop();
       // stack.pop();

        stack.push(3);
        stack.pop();

        System.out.println("최상단 값은 " + stack.peek());
        System.out.println("사이즈는 " + stack.size());



        if (stack.isEmpty()) {
            System.out.println("비었습니다");
        } else {
            System.out.println("비지 않았습니다.");
        }
    }
}
