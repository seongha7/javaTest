package com.example.javatest;
import java.util.ArrayList;

class Fruit  { public String toString() {
        return "Fruit";
    }}
class Apple extends Fruit{ public String toString() {return "Apple";}}
class Grape extends Fruit{ public String toString() {return "Grape";}}


class Juice {
    String name;
    Juice(String name) { this.name = name + "Juice";}
    public String toString() { return name;}
}

class Juicer {
    static Juice makeJuice(FrBox<? extends Fruit> box) {
        String tmp = "";

        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

class FruitBoxEx3 {
    public static void main(String[] args) {
        FrBox<Fruit> fruitBox = new FrBox<>();
        FrBox<Apple> appleBox = new FrBox<>();
        FrBox<Grape> grapeBox = new FrBox<>();


        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());


        appleBox.add(new Apple());
        grapeBox.add(new Grape());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}
class FrBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item);}
    T get (int i) { return list.get(i);}
    ArrayList<T> getList() { return list;}
    int size() { return list.size();}
    public String toString() { return list.toString();}
}
