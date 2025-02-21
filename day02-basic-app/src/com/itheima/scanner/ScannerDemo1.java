package com.itheima.scanner;

import java.util.Scanner;

/**
 * @author ChanYanny
 * @date 2025/02/15 22:05
 **/
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("您输入的数字是: " + num);
        String str = sc.next();
        System.out.println("您输入的字符串是: " + str);
    }
}

