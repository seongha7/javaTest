package com.example.javatest;
import java.util.ArrayList;

// 제일 나중에 들어온 값이 먼저 나가는 방식(후입선출) - Lifo
// 배열 사이즈 지정(배열인 경우에만), 배열 값 넣기 , 최상단 값 반환 및 제거, 값이 없거나 / 사이즈를 넘었을 때(배열의 경우에만) 알려주기

//제네릭 사용
public class MyStack<T> {
    //arraylist를 사용하여 myStack 구현
    private ArrayList<T> stackList = new ArrayList<>();

    //값 추가
    public void push(T item) {
        stackList.add(item);
    }

    //최상단 값 제거
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("스택이 비어있습니다.");
        }
        return stackList.remove(stackList.size() - 1);
    }

    //최상단 값 가져옴
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("스택이 비어있습니다.");
        }
        return stackList.get(stackList.size() - 1);
    }
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
    public int size() {
        return stackList.size();
    }
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println("스택 사이즈: " + myStack.size());
        System.out.println("최상단 값: " + myStack.peek());

        // 스택에 값이 존재하지 않을때까지 삭제
        while (!myStack.isEmpty()) {
            System.out.println("제거된 값: " + myStack.pop());
        }
    }
}
