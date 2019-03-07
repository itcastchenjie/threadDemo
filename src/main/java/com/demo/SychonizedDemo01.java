package com.demo;

public class SychonizedDemo01 {
    public static void main(String[] args) {

        TicketThread ticketThread = new TicketThread();
        Thread thread01 = new Thread(ticketThread);
        Thread thread02 = new Thread(ticketThread);
        Thread thread03 = new Thread(ticketThread);
        thread01.start();
        thread02.start();
        thread03.start();

    }

}
