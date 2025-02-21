package com.itheima.define;

/**
 * @author ChanYanny
 * @date 2025/02/19 19:48
 **/
public class MethodDemo2 {
    public static void main(String[] args) {
        printHello(2);
        System.out.println("-----");
        printHello(3);
    }

    public static void printHello(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!");
        }
    }
}

