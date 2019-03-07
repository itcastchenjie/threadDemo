package com.demo;


import java.io.*;

//编写一个程序，将 d: \ java1目录下的所有.java 文件复制到d: \ jad 目录下，
//              并 将原来文件的扩展名从.java 改为.jad
public class CopyFileFromOneToOne02 {
    public static void main(String[] args) throws IOException {


        File file = new File("D:\\hello");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });

        File targetFile = new File("D:\\copyFile");
        if (!(targetFile.exists())){
            targetFile.mkdirs();
        }

        for (File file1 : files) {
            String targetName = file1.getName().replace(".java", ".jad");
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1));
            final BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(targetFile, targetName)));
            copyMethod(bis,bos);
        }



    }

    private static void copyMethod(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        int len;

        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
    }
}