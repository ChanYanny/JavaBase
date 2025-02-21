package com.itheima.loop;

import java.util.Random;

/**
 * @author ChanYanny
 * @date 2025/02/19 11:59
 **/
public class RandomDemo5 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(0,10);
        System.out.println(number);
    }
}

