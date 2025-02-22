package com.itheima.string;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ChanYanny
 * @date 2025/02/22 17:19
 **/
public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要生成的验证码长度：");
        int length = sc.nextInt();
        String code = createCode(length);
        System.out.println("生成的验证码为： " + code);
    }

    public static String createCode(int length) {
        String code = "";
        Random random = new Random();
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(0, str.length());
            code += str.charAt(index);
        }
        return code;
    }
}

