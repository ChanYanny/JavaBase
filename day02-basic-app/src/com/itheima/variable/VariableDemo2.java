package com.itheima.variable;

/**
 * @author ChanYanny
 * @date 2025/02/15 20:57
 **/
public class VariableDemo2 {
    public static void main(String[] args) {
        // byte short int long
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        System.out.println("byte a: " + a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        // float double
        float e = 3.14F;
        double f = 2.71828;
        System.out.println("float e: " + e);
        System.out.println("double f: " + f);

        // char
        char g = 'A';
        System.out.println("char g: " + g);

        // boolean
        boolean h = true;
        boolean i = false;
        System.out.println("boolean h: " + h);
        System.out.println("boolean i: " + i);
    }
}

