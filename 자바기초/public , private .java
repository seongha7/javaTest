
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

// private 예시

package com.example.javatest;


public class Sample {
    public static void main(String[] args) {
        Car c = new Car();

        //c.fuel = 10; -> 값을 직접 대입할 수 없다.

        c.setFuel(10);
        System.out.println(c.getFuel());

        c.setFuel(-10);
        System.out.println(c.getFuel());

    }
}

class Car {
    private int fuel;

    void setFuel (int inputFuel) {
        if (inputFuel > 0 && inputFuel <= 100) {
            this.fuel = inputFuel;
        } else {
            System.out.println("fuel 값이 올바르지 않습니다.");
            this.fuel = 0;
        }
    }
    int getFuel () {
        return this.fuel;
    }
}
