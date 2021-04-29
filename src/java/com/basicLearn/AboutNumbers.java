package com.basicLearn;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

public class AboutNumbers {
    public static void main(String[] args) {
        System.out.println(BigDecimal.valueOf(10.2f).equals(BigDecimal.valueOf(10.2)));
        System.out.println("-".equals("-"));
        Float f1 = 0.1f;
        Float f2 = 0.1f;
        System.out.println("1" + (f1 == f2));
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
        Integer integer = Integer.valueOf(2);
        changeBoxNumber(integer);
        System.out.println(integer);

        BigDecimal b = BigDecimal.valueOf(0.3222).setScale(5, RoundingMode.HALF_UP);//保留两位小数
        System.out.println("结果是" + b);
        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.setMaximumFractionDigits(2);
        System.out.println(percent.format(b.doubleValue()));
        Boolean ssb = null;
        System.out.println(ssb);
        testFloat();
        arrayInitial();
        testString();
        objectTest();
        aboutCollections();
    }

    private static void aboutCollections() {
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add("ss");
        arrayList.add("ss");
        arrayList.add("ss");
        arrayList.add("ss");

        LinkedList<String> linkedList = new LinkedList<>();

        HashMap map = new HashMap();
        map.put(null, "nu2ll");
        System.out.println(map.get(null));
        Hashtable hashtable = new Hashtable();
        hashtable.put(null, "nu2ll");
        System.out.println(hashtable.get(null));
    }

    private static void objectTest() {
        Object o = new Object();
        o.hashCode();
    }

    private static void testString() {
        String str = "test";
    }

    private static void arrayInitial() {
        int[] array = new int[2];
        array[0] = 2;
    }

    private static void testFloat() {
        //float f=3.4;错误，不能通过编译,3.4是double不能直接大转小
        float fuck = (float) 3.4;
        float f = 3.4f;
    }

    public static void changeBoxNumber(Integer integer) {
        integer = 3;
    }
}
