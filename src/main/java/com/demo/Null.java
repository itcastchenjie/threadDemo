package com.demo;

public class Null {
    public static void main(String[] args) {
        ((Null) null).hello();
        Null.hello();

    }

    public static void hello() {
        System.out.println("hello");
    }

}
