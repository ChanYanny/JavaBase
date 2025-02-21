package com.itheima.object;

/**
 * @author ChanYanny
 * @date 2025/02/20 11:26
 **/
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();

        stu1.name = "波妞";
        stu1.chinese = 100;
        stu1.math = 100;

        stu1.printTotalScore();
        stu1.printAverageScore();

        stu2.name = "波仔";
        stu2.chinese = 59;
        stu2.math = 100;

        stu2.printTotalScore();
        stu2.printAverageScore();
    }
}

