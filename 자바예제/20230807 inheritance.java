package com.example.javatest;

class Animal {
    String name;
    int age;

    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal {
    void rest() {
        System.out.println(this.name + " zzz..." + " his age is " + this.age);
    }
}

class Cat extends Animal {
    void rest() {
        System.out.println(this.name + " zzz..." + " her age is " + this.age);
    }
}

class HomeDog extends Dog {
    void rest() {
        System.out.println(this.name + " zzz... in home" + " his age is " + this.age);
    }
}


public class Example{
    public static void main(String[] args) {
        HomeDog homeDog = new HomeDog();
        Cat cat = new Cat();
        Dog dog = new Dog();
        homeDog.setName("homeDog");
        homeDog.setAge(8);
        homeDog.rest();

        cat.setName("Cat");
        cat.setAge(3);
        cat.rest();

        dog.setName("dog");
        dog.setAge(4);
        dog.rest();
    }
}
