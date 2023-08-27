package com.example.javatest;

class Node {
    int data; // 노드가 저장하는 정수형데이터
    Node next; // 다음 노드를 가리키는 참조


    public Node(int data) { // 데이터를 받아서 노드를 생성
        this.data = data; // 노드의 생성자에서 파라미터로 받은 데이터 값을 노드의 데이터 필드에 할당하는 역할을 해즌다.
        this.next = null; // next를 null로 주는 이유는 list의 마지막 노드를 나타내기 위해서이다.
    }
}
class LinkedList {
    Node head;  // list의 첫 번째 노드를 가리킴
    public LinkedList() {
        this.head = null; // 빈 list 생성
    }

    //데이터를 받아서 리스트 끝에 노드 추가
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // list의 첫번째 노드 추가
            return;
        }
        Node current = head; // 현재 노드를 처음 노드로 초기화
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode; // current는 현재 처리 중인 노드를 나타내는 변수
    }
    // 꺼내기
    public void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    //출력
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(); // 클래스 인스턴스 생성
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.display();
        linkedList.remove(2);
        linkedList.display();
    }
}
