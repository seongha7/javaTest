package com.example.javatest;
import java.util.LinkedList;

// 제일 처음 들어온 값이 가장 먼저 나가는 방식(선입선출) - FIFO
// 배열 사이즈 지정(배열인 경우에만), 배열 값 넣기 , 최상단 값 반환 및 제거, 값이 없거나 사이즈를 넘었을 때 알려주기


public class MyQueue<T> {
    private LinkedList<T> queueList = new LinkedList<>();

    //값 추가
    public void enqueue(T item) {
        queueList.addLast(item);
      //queueList.add(item);
    }

    //첫번째 값 제거
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("큐가 비어있습니다.");
        }
        return queueList.removeFirst();
      //return queueList.remove(0);
    }

    //첫번째 값 불러옴
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("큐가 비어있습니다.");
        }
        return queueList.getFirst();
      //return queueList.get(0);
    }
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    public int size() {
        return queueList.size();
    }
    public static void main(String[] args) {
        MyQueue<Integer> myqueue = new MyQueue<>();
        myqueue.enqueue(1);
        myqueue.enqueue(2);
        myqueue.enqueue(3);
        System.out.println("큐 크기: " + myqueue.size());
        System.out.println("첫째 값: " + myqueue.peek());

        //선입선출, 큐에 값이 없을때까지 반복
        while (!myqueue.isEmpty()) {
            System.out.println("제거된 값: " + myqueue.dequeue());
        }
    }
}
