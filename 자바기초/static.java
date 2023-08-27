package com.example.javatest;

class StaticExample {

    // static 필드 선언
    static int x = 3;

    static int y = 4;

    // static 메서드 선언
    static int multi(int a, int b){
        return a * b;
    }
}

// static 멤버 사용 클래스
  class UsedStaticExample {
    public static void main(String[] args) {
        int a = StaticExample.x;
        int b = StaticExample.y;
        int result = StaticExample.multi(a, b);

        System.out.println("x * y = " + result);
    }
}
