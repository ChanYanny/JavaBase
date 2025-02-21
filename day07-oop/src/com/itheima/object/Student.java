package com.itheima.object;

/**
 * @author ChanYanny
 * @date 2025/02/20 11:23
 **/
public class Student {
    String name;
    double chinese;
    double math;

    public void printTotalScore(){
        double totalScore = chinese + math;
        System.out.println(name + "的总成绩为" + totalScore);
    }

    public void printAverageScore(){
        double averageScore = (chinese + math) / 2;
        System.out.println(name + "的平均成绩为" + averageScore);
    }
}

