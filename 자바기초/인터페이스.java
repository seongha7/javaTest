// 예시 1

package com.example.javatest;

interface CoffeeInterface {
     void printCoffee(); // 메서드만 생성
}

interface CakeInterface {
    public void printCake(); // 메서드만 생성
}

class CafeClass implements CoffeeInterface, CakeInterface {
    String coffee;
    String cake;
    int coffeePrice;
    int cakePrice;

    CafeClass(String coffee, int coffeePrice, String cake, int cakePrice) {
        this.coffee = coffee;
        this.coffeePrice = coffeePrice;
        this.cake = cake;
        this.cakePrice = cakePrice;
    }


    @Override
    public void printCoffee() {
        System.out.println(coffee + "는 " + coffeePrice + "원입니다.");
    }

    @Override
    public void printCake() {
        System.out.println(cake + "는 " + cakePrice + "원입니다.");
    }
}

public class Sample {
    public static void main(String[] args) {
        CafeClass cafe = new CafeClass("아메리카노", 4000, "치즈케이크", 5500);
        cafe.printCake();
        cafe.printCoffee();
    }
}
// 상속 예시 

package com.example.javatest;


class ResCustomer {
    public String resCustomer;

    public void setResCustomer(String resCustomer) {
        this.resCustomer = resCustomer;
    }
}

class ResCustomer1 extends ResCustomer{}

class ResCustomer2 extends ResCustomer{}

class Resowner {
    public void giveFood(ResCustomer1 resCustomer1) {
        System.out.println("1에게 제육을 준다");
    }

    public void giveFood(ResCustomer2 rescustomer2) {
        System.out.println("2에게 돈까스를 준다");
    }

}

public class Sample {
    public static void main(String[] args) {
        Resowner resowner = new Resowner();
        ResCustomer1 a = new ResCustomer1();
        ResCustomer2 b = new ResCustomer2();

        resowner.giveFood(a);
        resowner.giveFood(b);
    }
}       // 만약 손님이 늘어난다면, 만들어야 할 오버로딩된 메서드가 늘어나게 된다.


// 예시 2

package com.example.javatest;


interface ResCustomer {
    String getOrder();
}

class ResCustomer1 implements ResCustomer {
    public String getOrder() {
        return "1에게 제육을 준다.";
    }
}
class ResCustomer2 implements ResCustomer {
    public String getOrder() {
        return "2에게 돈까스를 준다.";
    }
}
class ResCustomer3 implements ResCustomer { // 추가
    public String getOrder() {
        return "3에게 고구마돈까스를 준다.";
    }
}

class ResOwner {
    public void giveFood(ResCustomer resCustomer) {
        System.out.println(resCustomer.getOrder());
    }
}

public class Sample {
    public static void main(String[] args) {
        ResOwner owner = new ResOwner();
        ResCustomer1 a = new ResCustomer1();
        ResCustomer2 b = new ResCustomer2();
        ResCustomer3 c = new ResCustomer3(); // 추가

        owner.giveFood(a);
        owner.giveFood(b);
        owner.giveFood(c); // 추가
    }
}
// 인터페이스 다중 상속 예시 

package com.example.javatest;


interface Person {
    String species = "영장류";

      void country();
}

interface Father extends Person {
     void country();
}

interface Mother extends Person {
     void country();
}

public class Sample implements Mother,Father{

    @Override
    public void country() {
        System.out.println("korea");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println("나의 생물학적 분류는 " + sample.species + "입니다.");
        sample.country();
    }
}


//상속과 인터페이스 예시 

package com.example.javatest;


class Parents {
    boolean hairLoss = false;

}

interface Programmer {
    void programming();
}

interface Driver {
    void drive();
}

public class Sample extends Parents implements Programmer,Driver{

    @Override
    public void programming() {
        System.out.println("나는 프로그래머");
    }

    @Override
    public void drive() {
        System.out.println("나는 드라이버");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        if (sample.hairLoss) {
            System.out.println("탈모..");
        } else {
            System.out.println("탈모 아님 ㅋ");
        }
        sample.programming();
        sample.drive();
    }
}
