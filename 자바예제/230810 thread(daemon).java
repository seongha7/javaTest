package com.example.javatest;



class ThreadEx implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx());
        t.setDaemon(true); // 종료시켜주는 부분
        t.start();

        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
            System.out.println(i);

            if (i==5) {
                autoSave = true;
            }
        }
        System.out.println("프로그램을 종료합니다");

    }
    public void run() {
        while(true) {
            try {
                Thread.sleep(3 * 500); // 3* 500 초 마다
            } catch (InterruptedException e) {}

            if (autoSave) {
                autoSave();
            }
        }
    }
    public void autoSave () {
        System.out.println("작업파일이 자동저장되었습니다");
    }
}
