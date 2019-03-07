package com.demo;

/**
 * 将一组数据从大到小排序（使用冒泡排序）
 */
public class OrderDemo {
    public static void main(String[] args) {
        int[] array = {1, 3, 13, 2, 15, 18, 10};


        printOrderBydesc(array);


    }

    private static void printOrderBydesc(int[] array) {
        maoPaoOrderByDesc(array);
        System.out.print("从大到小排序为：");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }

    }

    /**
     * 冒泡排序，从大到小
     *
     * @param array
     */
    private static void maoPaoOrderByDesc(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = (i + 1); j < length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }


    }


}
