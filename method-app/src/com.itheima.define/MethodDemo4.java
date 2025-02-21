package com.itheima.define;

/**
 * @author ChanYanny
 * @date 2025/02/19 20:00
 **/
public class MethodDemo4 {
    public static void main(String[] args) {

        judge(100);
    }

    public static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void judge(int n){
        if (n % 2 == 0){
            System.out.println(n + "是偶数");
        }else {
            System.out.println(n + "是奇数");
        }
    }
}

