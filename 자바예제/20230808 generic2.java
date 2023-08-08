package com.example.javatest;
import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() {
        return "Fruit";
    }
}
class Apple extends Fruit{ public String toString() {return "Apple";}}
class Grape extends Fruit{ public String toString() {return "Grape";}}
class Toy{ public String toString() {return "Toy";}} // 여기서 toy는 fruit의 자손이 아님

interface Eatable {}

class FruitBoxEx2 {
    public static void main(String[] args) {
        FrBox<Fruit> fruitBox = new FrBox<>();
        FrBox<Apple> appleBox = new FrBox<>();
        Box<Toy> toyBox = new Box<>(); // Frbox시 적용 불가 
        FrBox<Grape> grapeBox = new FrBox<>();


        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());


        appleBox.add(new Apple());
        grapeBox.add(new Grape());
        toyBox.add(new Toy());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);
        System.out.println(toyBox);
    }
}
class FrBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item);}
    T get (int i) { return list.get(i);}
    int size() { return list.size();}
    public String toString() { return list.toString();}
}
