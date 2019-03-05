package com.itheima.domain;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectUtils {
    public static void main(String[] args) throws Exception {
        InputStream in = ReflectUtils.class.getClassLoader().getResourceAsStream("pro.properties");
        Properties pro = new Properties();
        pro.load(in);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");


        Class aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);


    }


}
