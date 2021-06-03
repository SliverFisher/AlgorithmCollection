package com.basicLearn.juclearn.pool;

import java.util.concurrent.*;

public class PoolTest {
    /***
     * futureTask只执行一次，执行完毕，掉用run不会在执行
     * @param args
     */
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2, 3, 2, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3));
        FutureTask futureTask=new FutureTask<>(new MyTask());
        try {
            futureTask.run();
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("main start");
        pool.execute(futureTask);

    }
}
class MyTask implements Callable{

    @Override
    public Object call() throws Exception {
        Thread.sleep(5000);
        System.out.println("?");
        return "null";
    }
}
