package com.demo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\e.txt", true);
        fw.write(98);
        fw.write("\r\n");
        fw.write("黑马程序员", 2, 3);
        fw.close();

        

    }


}
