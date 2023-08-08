package com.example.javatest;
import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "Fruit";
    }
}
class Apple extends Fruit{ public String toString() {return "Apple";}}
class Grape extends Fruit{ public String toString() {return "Grape";}}
class Toy{ public String toString() {return "Toy";}}

class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();

        // 상속관계라 가능
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // ok. void add(Fruit item)
        fruitBox.add(new Grape());

        // 각각의 것들만 담을 수 있음(apple 에는 apple 만 가능)
        appleBox.add(new Apple());
        grapeBox.add(new Grape());
        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println(toyBox);
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item);}
    T get (int i) { return list.get(i);}
    int size() { return list.size();}
    public String toString() { return list.toString();}
}
