package com.example.javatest;

class Person{
    public void Func1() {
        System.out.println("this is func1");
    }
    public void Func1(String str) {
        System.out.println("this is overloading func1 : " + str);
    }
}

public class Example{
    public static void main(String[] args) {
        Person person = new Person();
        person.Func1();
        person.Func1("매개변수 넣기");
    }
}
