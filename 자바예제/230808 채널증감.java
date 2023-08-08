package com.example.javatest;


class Tv{
    int channel;

    void channelUp() {++channel;}
    void  channelDown() {--channel;}
}


class TvTest {
    public static void main(String[] args) {

        Tv tv = new Tv();
        tv.channel = (int) Math.random() *5 +1;
        if (tv.channel == 1) {
            tv.channelUp();
            System.out.println("현재 채널은 1이고 +1 하겠습니다. 채널 " + tv.channel);
        } else if (tv.channel == 2) {
            tv.channelUp();
            System.out.println("현재 채널은 2이고 +1 하겠습니다. 채널 " +tv.channel);
        } else if (tv.channel == 3) {
            tv.channelUp();
            System.out.println("현재 채널은 3이고 +1 하겠습니다. 채널 " +tv.channel);
        } else if (tv.channel ==4) {
            tv.channelDown();
            System.out.println("현재 채널은 4이고 -1 하겠습니다. 채널 " +tv.channel);
        } else {
            tv.channelDown();
            System.out.println("현재 채널은 5이고 -1 하겠습니다. 채널" +tv.channel);
        }
    }
}
