package com.example.javatest;

 class Test {
    // 상수 선언
    static final double INCH = 2.54;
    static final double CM = 1;
    static final double MONITOR_WIDTH;

    // 상수 초기값 선언
    static {
        MONITOR_WIDTH = 14 * INCH * CM;
    }

    // 상수 사용
    public static void main(String[] args) {
        System.out.println("14인치 모니터 cm는? "+ MONITOR_WIDTH);
    }
}
