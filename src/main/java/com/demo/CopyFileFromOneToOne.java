package com.demo;


import java.io.*;

//编写一个程序，将 d: \ java1目录下的所有.java 文件复制到d: \ jad 目录下，
//              并 将原来文件的扩展名从.java 改为.jad
public class CopyFileFromOneToOne {
    public static void main(String[] args) throws IOException {

        //找到文件夹
        File file = new File("D:\\java1");

        //找到该文件夹下面的以.java结尾的文件
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });

        //找到目标文件
        File targetFile = new File("D:\\jadididi");
        if (!targetFile.exists()){
            targetFile.mkdirs();
        }


        //修改文件扩展名
        for (File file1 : files) {
            String targetFileName = file1.getName().replace(".java", ".jad");
            //创建输入输出流复制文件
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(targetFile, targetFileName)));
            copyDemo02(bis,bos);


        }



    }

    private static void copyDemo02(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        int length;
        while ((length=bis.read())!=-1){
            bos.write(length);
        }
        //关闭流
        bos.close();
        bis.close();

    }


}
