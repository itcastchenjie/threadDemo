package com.itheima;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestDemo {
    public static void main(String[] args) {


        ExecutorService service = Executors.newFixedThreadPool(2);
        ThreadDemo02 demo02 = new ThreadDemo02();
        ThreadDemo02 demo03 = new ThreadDemo02();
        service.submit(demo02);
        service.submit(demo03);

//        ThreadDemo01 demo01 = new ThreadDemo01();
//        ThreadDemo01 demo02 = new ThreadDemo01();
//        ThreadDemo02 threadDemo02 = new ThreadDemo02();
//        Thread thread = new Thread(threadDemo02, "runnable线程");
//        demo01.run();
//        demo02.run();
//        thread.run();
    }


}
