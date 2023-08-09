package com.example.javatest;


public class Tv{
    int channel;

    public void channelUp() {
        if ( this.channel >= 5) {
            System.out.println("5번 이후의 채널은 없습니다\n채널업->");
            this.channel = 1;
        } else if (this.channel == 0){
            System.out.println("0번 채널은 없습니다\n채널업->");
            this.channel = 1;
        } else {
            this.channel++;
         } return;
    }

    public void channelDown() {
        if ( this.channel >= 6) {
            System.out.println("5번 이후의 채널은 없습니다\n채널다운->");
            this.channel = 5;
        } else if (this.channel == 0){
            System.out.println("0번 채널은 없습니다\n채널다운->");
            this.channel = 1;
        } else {
            this.channel--;
        } return;
    }

    }

     class TvEx {
        public static void main(String[] args) {
            Tv t = new Tv();
            t.channel = 0; // 채널 업
            t.channelUp();
            System.out.println("현제 채널은 " + t.channel + "입니다.");
            t.channel = 6; // 채널 다운
            t.channelDown();
            System.out.println("현제 채널은 " + t.channel + "입니다.");
        }
    }
