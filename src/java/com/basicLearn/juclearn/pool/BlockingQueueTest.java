package com.basicLearn.juclearn.pool;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueTest {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue(16);
        queue.add("22");
    }
}
