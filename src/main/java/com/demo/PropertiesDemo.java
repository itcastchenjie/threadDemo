package com.demo;

import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {


        show02();


    }

    private static void show02() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("李四","14");
        properties.setProperty("王五","15");
        properties.setProperty("赵六","16");
        FileWriter fs = new FileWriter("D:\\f.txt");
        properties.store(fs,"save");
        fs.close();


    }

    private static void show01() {
        Properties properties = new Properties();
        properties.setProperty("李四","14");
        properties.setProperty("王五","15");
        properties.setProperty("赵六","16");

        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"="+properties.getProperty(s));
        }

    }




}
