package com.basicLearn.proxylearn;

public class TrueService implements ProxyInterfaceOne, ProxyInterfaceTwo {
    private int a;


    @Override
    public void doSomething(String message) {
        System.out.println(message);
    }

    @Override
    public void doOtherThing(String message) {
        System.out.println(message);
    }
}
