package com.example.javatest;

abstract class Animal {
    abstract void cry();
}
class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("냐옹");
    }
}
class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        d.cry();
    }
}
