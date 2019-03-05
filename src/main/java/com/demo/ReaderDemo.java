package com.demo;

import java.io.FileReader;

/**
 * 字符输入流
 */
public class ReaderDemo {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("d:\\ba.txt");
        int len;
        char[] chars = new char[1024];
        while ((len = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }

    }
}