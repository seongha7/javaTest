package com.example.javatest;



class ThreadEx {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx1 th1 = new ThreadEx1();
        th1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.println("소요시간1:" + (System.currentTimeMillis() - ThreadEx.startTime));
    }
}

class ThreadEx1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }
        System.out.println("소요시간2:" + (System.currentTimeMillis() - ThreadEx.startTime));
    }
}
