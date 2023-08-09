package com.example.javatest;



enum Transportation {
    BUS(100)    { int fare(int distance) {return distance*BASIC_FARE;}},
    TRAIN(150)    { int fare(int distance) {return distance*BASIC_FARE;}},
    SHIP(100)    { int fare(int distance) {return distance*BASIC_FARE;}},
    AIRPLANE(300)    { int fare(int distance) {return distance*BASIC_FARE;}};

    protected final int BASIC_FARE; //각 상수에서 접근 가능하게 함

    Transportation(int basicFare) {
        BASIC_FARE = basicFare;
    }

    public int getBASICFARE() { return BASIC_FARE;}

    abstract int fare(int distance); //거리에 따른 요금 계산

}

class EnumEx2 {
    public static void main(String[] args) {
        System.out.println("bus fare=" +  Transportation.BUS.fare(100));
        System.out.println("train fare=" + Transportation.TRAIN.fare(500));
        System.out.println("ship fare=" + Transportation.SHIP.fare(1000));
        System.out.println("airplane fare=" + Transportation.AIRPLANE.fare(2000));
    }
}
