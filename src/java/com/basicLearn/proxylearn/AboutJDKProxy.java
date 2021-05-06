package com.basicLearn.proxylearn;

import java.lang.reflect.Proxy;

public class AboutJDKProxy {
    public static void main(String[] args) {
        TrueService temp = new TrueService();
        ProxyInterfaceOne proxyInterfaceOne = (ProxyInterfaceOne) Proxy.newProxyInstance(temp.getClass().getClassLoader(), temp.getClass().getInterfaces(),
                new InvokeHandler(temp));
        proxyInterfaceOne.doSomething("doSomeThing");

        ProxyInterfaceTwo proxyInterfaceTwo = (ProxyInterfaceTwo) Proxy.newProxyInstance(temp.getClass().getClassLoader(), temp.getClass().getInterfaces(),
                new InvokeHandler(temp));
        proxyInterfaceTwo.doOtherThing("doOtherThing");


        System.out.println(Proxy.newProxyInstance(temp.getClass().getClassLoader(), temp.getClass().getInterfaces(),
                new InvokeHandler(temp)));
    }
}
