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
