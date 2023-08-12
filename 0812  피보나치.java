package com.example.javatest;


class Example {
    public static void main(String[] args) {
      final int [] fibonachi = new int[100]; 

        fibonachi[1] = 1;
        fibonachi[2] = 1;

        System.out.println(fibonachi[1]);
        System.out.println(fibonachi[2]);

        for (int i = 3; i < 100; i++) {
                fibonachi[i] = fibonachi[i - 2] + fibonachi[i - 1];
                System.out.println(fibonachi[i] + " ");
            }
        }
    }
