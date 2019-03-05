package com.demo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\a.txt");
        int len = 0 ;
        byte[] bytes = new byte[1024 * 8];
        while ((len = fis.read(bytes))!=-1){
            System.out.println((new String(bytes,0,len)));
        }
        fis.close();

    }
}
