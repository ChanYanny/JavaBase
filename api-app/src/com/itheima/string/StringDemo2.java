package com.itheima.string;

import java.util.Scanner;

/**
 * @author ChanYanny
 * @date 2025/02/22 17:09
 **/
public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (count <= 3) {
            System.out.println("请你输入用户名：");
            String username = sc.next();
            System.out.println("请你输入密码：");
            String password = sc.next();
            boolean isLogin = login(username, password);
            if (isLogin) {
                System.out.println("欢迎您，" + username + "!");
            } else {
                System.out.println("用户名或密码错误！");
            }
            count += 1;
        }
    }

    public static boolean login(String username, String password) {
        String adminUsername = "admin";
        String adminPassword = "123456";
        return username.equals(adminUsername) && password.equals(adminPassword);
    }
}

