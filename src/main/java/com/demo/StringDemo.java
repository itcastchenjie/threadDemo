package com.demo;

public class StringDemo {

    /**
     * 设计一个通用方法
     * 根据给定的字符串计算该字符串的长度，如‘hello world java’;
     * @param args
     */
    public static void main(String[] args) {
        String word = "hello world java classLoader";

        int num;
        num = countNum(word);
        System.out.println(num);


    }

    public static int countNum(String str){
        String[] split = str.split(" ");
        for (String s : split) {
            System.out.println(s);
        }
        return split.length;
    }



}
