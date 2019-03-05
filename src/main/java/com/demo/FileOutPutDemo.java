package com.demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\c.txt", true);
        for (int i = 1; i < 5; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
