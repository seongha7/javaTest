package com.example.javatest;

class exceptionEx {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (Exception e) {  //ArithmeticException 대신 Exception을 사용함
            System.out.println(5);
        }
        System.out.println(6);
    }
}
