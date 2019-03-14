package com.demo;


import com.domain.User;

import java.util.*;

//取出集合里面的name的属性值拼接输出
public class StringBuiderDemo {
    public static void main(String[] args) {
        User user1 = new User(11, "wangwu");
        User user2 = new User(12, "lisi");
        User user3 = new User(13, "zhangsan");

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            User user = (User) list.get(i);
            String name = user.getName();
            sb.append(name);


        }

        String str = sb.toString();
        System.out.println(str);

    }
}
