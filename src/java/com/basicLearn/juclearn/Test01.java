package com.basicLearn.juclearn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test01 {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(88);
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                hotel.saleWithLock();

            }
        }, "线程0").start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                hotel.saleWithLock();

            }
        }, "线程1").start();
        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                hotel.saleWithLock();

            }
        }, "线程2").start();
    }

}

class Hotel {
    Lock lock = new ReentrantLock();
    private int girls = 100;

    private void sale() {
        if (girls > 0) {
            girls--;
            System.out.println("还有姑娘" + girls + ",由" + Thread.currentThread().getName() + "执行");
        }
    }

    public void saleWithLock() {
        lock.lock();
        try {
            this.sale();
        } finally {
            lock.unlock();
        }
    }

    public Hotel(int girls) {
        this.girls = girls;
    }
}
class Room extends Hotel{

    public Room(int girls) {
        super(girls);
    }
}
