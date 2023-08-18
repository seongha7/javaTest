package com.example.javatest;

// 제일 나중에 들어온 값이 먼저 나가는 방식(후입선출)
// 배열 사이즈 지정, 배열 값 넣기 , 최상단 값 반환 및 제거, 값이 없거나 사이즈를 넘었을 때 알려주기



 class MyStack {
    int[] myArr; //배열
    int stackSize; // 배열사이즈
    int top; //최상단 값

    MyStack (int size) {
        //매개값 이용 필드변수 초기화
        myArr = new int[size];
        stackSize = size;
        top = -1; // 스택이 비어있음을 나타내기 위한 초기값
    }

    // 값 추가
    public void push(int x) {
        if (isFull()) {
            System.out.println("스택이 꽉 찼습니다.");
            System.exit(-1); // 비정상종료
        } else {
            System.out.println("값을 받았습니다 -> " + x );
            myArr[++top] = x; // 값이 참조되기 전에 증가 (전위형)
        }
    }

    // 최상단 값 반환
    public int peek() {
        if (isEmpty()) {
            System.out.println("스택이 비었습니다");
            System.exit(-1);
        }
            return myArr[top];

    }

    //최상단 값 제거
    public int pop() {
        if (isEmpty()) {
            System.out.println("스택이 비었습니다");
            System.exit(-1);
        }
            System.out.println("삭제 중-> " + peek() );
            return myArr[top--]; // 값이 참조된 후에 감소 (후위형)
    }

     public boolean isEmpty() {
         return top == -1;
     }

     public boolean isFull() {
         return top == stackSize -1;
     }

     public static void main(String[] args) {
         MyStack myStack = new MyStack(3);

         myStack.push(1);
         myStack.push(2);
         myStack.push(3);
         //myStack.push(3);

         System.out.println("최상단 값은 " + myStack.peek());

         myStack.pop();

         System.out.println("최상단 값은 " + myStack.peek());

     }

 }
