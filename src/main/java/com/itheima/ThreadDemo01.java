package com.itheima;

public class ThreadDemo01 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+":::::::::::"+i);
        }
    }
}
