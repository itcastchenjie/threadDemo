package com.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();

        properties.load(new FileReader("d:\\f.txt"));

        Set<String> key = properties.stringPropertyNames();
        for (String s : key) {
            Object o = properties.get(s);
            System.out.println(s+"="+o);
        }



    }


}
