package com.demo;

/**
 * 打印出100-999中的水仙花束；
 * 水仙花束（是指一个三位数，其各位数字立方和为该数本身）
 */
public class ShuiXianFlowerDemo {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int bai = (i / 100) % 10;
            int shi = (i / 10) % 10;
            int ge = i % 10;
            int count1 = bai*bai*bai;
            int count2 = shi*shi*shi;
            int count3 = ge*ge*ge;
            int count = count1+count2+count3;
            if (i==count){
                System.out.println(count);
            }

        }


    }
}
