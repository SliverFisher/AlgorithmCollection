package com.basicLearn.proxylearn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvokeHandler implements InvocationHandler {
    private Object target;

    public InvokeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoker   Before");
        Object result = method.invoke(target, args);
        System.out.println("invoker   After");
        return result;
    }
}
