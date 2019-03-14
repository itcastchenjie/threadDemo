package com.demo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class HashDemo {
    public static void main(String[] args) {

        String s1 = new String("你好");
        String s2 = new String("你好");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));


    }
}
