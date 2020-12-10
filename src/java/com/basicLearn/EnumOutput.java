package com.basicLearn;

enum Season {
    Spring(1);
    private int seq;

    Season(int seq) {
        this.seq = seq;
    }
}

public class EnumOutput {
    public static void main(String[] args) {
        System.out.println(Season.Spring);
    }
}
