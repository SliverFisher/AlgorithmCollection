package com.basicLearn.juclearn.callleanrn;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Call call = new Call();
        FutureTask<String> futureTask = new FutureTask<>(call);
        new Thread(futureTask).start();
        String result = futureTask.get();
        System.out.println(result);
    }
}

class Call implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return "1222";
    }
}
