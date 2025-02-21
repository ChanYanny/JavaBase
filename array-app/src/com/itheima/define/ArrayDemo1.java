package com.itheima.define;

/**
 * @author ChanYanny
 * @date 2025/02/19 12:59
 **/
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] ageArr = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < ageArr.length; i++) {
            sum += ageArr[i];
        }
        System.out.println("数组中所有元素的和为: " + sum);

    }
}

