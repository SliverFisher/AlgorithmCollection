package com.classic;

public class TowerOfHanoi {
    public static void main(String[] args) {
        test(8,"A","B","C");
    }

    private static void test(int n ,String a,String b, String c) {
        if(n==1){
            System.out.println(a+"--->"+c);
        }else {
            test(n-1,a,c,b);
            System.out.println(a+"--->"+c);
            test(n-1,b,a,c);
        }
    }
}
