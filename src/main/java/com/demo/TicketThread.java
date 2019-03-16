package com.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketThread implements Runnable {

    private int ticket = 100;

    Lock lock = new ReentrantLock();




    @Override
    public void run() {
        while (true) {

            lock.lock();

            if (ticket > 0) {
                try {
                    System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票");
                    Thread.sleep(10);
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }

        }

    }
}
