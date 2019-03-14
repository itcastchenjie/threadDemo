package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 将（工号，姓名）EXP：（1，zhangsan），（2，lisi）这两个员工信息存入Map,并且遍历输出打印
 */
public class PrintMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        Set<Integer> keySet = map.keySet();
        for (Integer integer : keySet) {
            String value = map.get(integer);
            System.out.println(integer+"="+value);
        }

    }

}
