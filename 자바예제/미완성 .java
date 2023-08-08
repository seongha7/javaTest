package com.example.javatest;


class Tv {
    int channel;

    public void ChannelUp() {
        if (this.channel < 1) {
            System.out.println("더 낮은 채널은 없습니다. 5번채널로 돌아갑니다.");
            this.channel = 5;
        } else if (channel >= 5) {
            System.out.println("더 이상 채널이 없습니다. 1번 채널로 돌아갑니다.");
            this.channel = 1;
        }
            this.channel++;
            return;
    }

    public void ChannelDown() {
        if (this.channel <= 1) {
            System.out.println("채널이 없습니다. 5번 채널로 돌아갑니다.");
            this.channel =5;
        }

        if (this.channel >= 5) {
            System.out.println("더 이상 채널이 없습니다. 1번 채널로 돌아갑니다.");
            this.channel =1;

        }
        this.channel--;
        return;
    }

    public class TvTest {
        public static void main(String[] args) {
            Tv t = new Tv();
            t.channel = 3;
            t.ChannelUp();
            System.out.println(t.channel);
            t.channel = 3;
            t.ChannelDown();

        }
    }
}
