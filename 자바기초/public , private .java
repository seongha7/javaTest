
// public 예시 

package com.example.javatest;



public class Sample {
    public static void main(String[] args) {
        Car c = new Car();

        c.fuel = 10;
        c.show();

        c.fuel = -10;
        c.show();
        // 자동차 연료 값에 음수를 포함하지 않으려 함. 예외처리를 클래스 외부가 아닌 내부에서 해야하는데
        // 이를 위해 클래스 내부변수( int fuel)에 직접 접근하는 코드를 막아야함.
    }
}

class Car {
   public int fuel;

    public void show() {
        System.out.println("연료의 양은 " + fuel + " 입니다.");
    }
}
