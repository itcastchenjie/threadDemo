package com.demo;


import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 复制文件
 */
public class CopyDemo {

    public static void main(String[] args) throws Exception{
        long s = System.currentTimeMillis();
        //创建文件字节输入流
        FileInputStream fis = new FileInputStream("d:\\s.jpg");
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream("d:\\3.jpg");
        //读取文件
        byte[] bytes = new byte[1024 * 8];
        int len = 0 ;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共计时间"+(e-s)+"毫秒");

    }

}
