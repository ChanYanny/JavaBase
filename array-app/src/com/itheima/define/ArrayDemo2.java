package com.itheima.define;

import java.util.Scanner;

/**
 * @author ChanYanny
 * @date 2025/02/19 13:19
 **/
public class ArrayDemo2 {
    public static void main(String[] args) {
        // 0 0 0
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数（五个）：");
        double[] scores = new double[6];
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }
        System.out.println("平均分为："+(sum/scores.length));

    }
}

