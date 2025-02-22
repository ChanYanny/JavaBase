package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * @author ChanYanny
 * @date 2025/02/22 17:28
 **/
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list);

        list.add(1, "Grape");
        System.out.println(list);

        String str = list.get(1);
        System.out.println("Get element at index 1: " + str);

        int size = list.size();
        System.out.println("Size of the list: " + size);

        String move = list.remove(1);
        System.out.println("Removed element at index 1: " + move);
        System.out.println(list);

        boolean isMove = list.remove("Banana");
        System.out.println("Removed Banana: " + isMove);
        System.out.println(list);

        String pre = list.set(1, "Pineapple");
        System.out.println("Updated element at index 1: " + pre);
        System.out.println(list);
    }
}

