package com.example.javatest;

class Tv{
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class captionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class captionTvTest {
    public static void main(String[] args) {
        captionTv ctv = new captionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.caption = true;
        ctv.displayCaption("tvTest");
    }
}
