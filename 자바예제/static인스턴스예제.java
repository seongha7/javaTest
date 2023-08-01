package com.example.javatest;
import java.util.*;



class mathTest {
    long a, b;

    //인스턴스변수 a, b만을 이용해서 작업
    long add()  {return a + b;}
    long subtract() {return a - b;}
    long multiply() {return a * b;}
    double divide() {return a / b;}

    //매개변수만으로 작업(static)
    static long add (long a, long b) {return a + b;}
    static long subtract(long a, long b) {return a - b;}
    static long multiply(long a, long b) {return a * b;}
    static double divide(double a, double b) {return  a / b;}
}






public class Example {
    public static void main(String[] args) {
        //클래스메서드 호출, 인스턴스 생성없이 호출가능
        System.out.println(mathTest.add(300L, 100L));
        System.out.println(mathTest.subtract(300L, 100L));
        System.out.println(mathTest.multiply(300L, 100L));
        System.out.println(mathTest.divide(200.0, 100.0));

        //인스턴스 셍성
        mathTest mt = new mathTest();
        mt.a = 300L;
        mt.b = 100L;

        System.out.println(mt.add());
        System.out.println(mt.subtract());
        System.out.println(mt.multiply());
        System.out.println(mt.divide());
        }
    }

