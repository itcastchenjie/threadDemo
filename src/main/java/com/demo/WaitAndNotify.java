package com.demo;

public class WaitAndNotify {
    public static void main(String[] args) {
        //创建共同的锁对象
        Object object = new Object();

        //创建顾客线程
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (object) {
                        System.out.println("顾客二，老板我要。。。包子");
                        //等待老板生产包子
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客二，，感谢老板的包子，开吃");
                        System.out.println("------------------------------");
                    }
                }


            }
        }.start();

        //创建顾客线程
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (object) {
                        System.out.println("顾客一，老板我要。。。包子");
                        //等待老板生产包子
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客一，感谢老板的包子，开吃");
                        System.out.println("------------------------------");
                    }
                }


            }
        }.start();


        //创建老板线程
        new Thread() {
            @Override
            public void run() {
                while (true) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    synchronized (object) {
                        System.out.println("包子生产好了，请吃包子");
                        object.notifyAll();
                    }
                }
            }
        }.start();
    }
}
