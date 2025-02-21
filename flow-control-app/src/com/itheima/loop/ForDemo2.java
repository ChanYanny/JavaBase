package com.itheima.loop;

/**
 * @author ChanYanny
 * @date 2025/02/19 11:21
 **/
public class ForDemo2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}

