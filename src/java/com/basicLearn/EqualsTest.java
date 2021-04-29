package com.basicLearn;

public class EqualsTest {
    public static void main(String[] args) {
        System.out.println(new EqualsData() == new EqualsData());
        System.out.println(new Integer(2) == Integer.valueOf(2));
        Integer i1 = 2;
        Integer i2 = 2;
        System.out.println(i1 == i2);
        System.out.println(i1 == Integer.valueOf(2));
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;

        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));
    }
}

class EqualsData {
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
