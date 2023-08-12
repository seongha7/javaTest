package com.example.javatest;


class Example {
    public static void main(String[] args) {
        int u =  nthFibonacciTerm(122231);
        System.out.println(u);
    }

    public static int nthFibonacciTerm(long n) {
        double squareRootOf5 = Math.sqrt(5);
        double phi = (1 + squareRootOf5)/2;
        int nthTerm = (int) ((Math.pow(phi, n) - Math.pow(-phi, -n))/squareRootOf5);
        return nthTerm;
    }
}
