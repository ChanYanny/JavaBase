package com.itheima.define;

/**
 * @author ChanYanny
 * @date 2025/02/20 10:56
 **/
public class MethodDemo5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        printArray(arr1);
        int[] arr2 = {1, 2, 3, 4, 50};
        System.out.println(isEqual(arr1, arr2));
    }

    public static void change(int[] arr) {
        System.out.println("change1:" + arr[1]);
        arr[1] = 10;
        System.out.println("change2:" + arr[1]);
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("数组为空");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr1.length!= arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!= arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

