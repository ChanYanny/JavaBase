package com.itheima.define;

import java.util.Random;

/**
 * @author ChanYanny
 * @date 2025/02/19 13:38
 **/
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {22, 33, 35, 13, 88};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println("After shuffling:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

