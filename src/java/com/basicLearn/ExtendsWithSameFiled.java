package com.basicLearn;

public class ExtendsWithSameFiled {
    public int num1 = 0;

    public static void main(String[] args) {
        ExtendsWithSameFiled e = new Son();
        System.out.println(e.num1);
        System.out.println(e.getNum1());
    }

    public int getNum1() {
        return num1;
    }
}

class Son extends ExtendsWithSameFiled {
    public int num1 = 2;

    public int getNum1() {
        return num1;
    }
}
