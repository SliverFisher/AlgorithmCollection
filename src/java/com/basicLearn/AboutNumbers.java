package com.basicLearn;

public class AboutNumbers {
    public static void main(String[] args) {
        Float f1 = 0.1f;
        Float f2 = 0.1f;
        System.out.println(f1 == f2);
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1 == i2);
        Integer i3 = 1900;
        Integer i4 = 1900;
        System.out.println(i3 == i4);
        Float f3 = Float.valueOf(0.1f);
        Float f4 = Float.valueOf(0.1f);
        System.out.println(f3 == f4);
        System.out.println(f1 == 0.1);
        System.out.println(Float.valueOf(1.1f) == 1.1);
        /**
         * Float浮点数精度丢失，导致此处位false
         * */
        System.out.println(i4 == 1900);
        System.out.println(Integer.valueOf(1900) == 1900);
    }
}
