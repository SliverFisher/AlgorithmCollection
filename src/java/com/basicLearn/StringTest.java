package com.basicLearn;

public class StringTest {
    public static void main(String[] args) {
        String str0 = "a";
        String str1 = "b";
        String str2 = "ab";
        System.out.println(str2 == (str0 + str1).intern());
        System.out.println((str0 + str1).intern());
    }
}
