package com.itheima.string;

/**
 * @author ChanYanny
 * @date 2025/02/22 12:14
 **/
public class StringDemo1 {
    public static void main(String[] args) {
        String name = "John Doe";
        String newName = "Jane Doe";
        String upperCaseName = "JANE DOE";
        String info = "shit! This movie is a shit!";
        System.out.println("Name: " + name);

        System.out.println(name.length());

        char ch = name.charAt(0);
        System.out.println(ch);

        char[] chars = name.toCharArray();
        for (char c : chars) {
            System.out.print(c);
        }

        System.out.println();

        boolean isEqual = name.equals(newName);
        System.out.println("Is equal: " + isEqual);

        boolean isEqualIgnoreCase = newName.equalsIgnoreCase(upperCaseName);
        System.out.println("Is equalIgnoreCase: " + isEqualIgnoreCase);

        String substr = name.substring(0,4);
        System.out.println("Substring: " + substr);

        String newInfo = info.replace("shit", "**");
        System.out.println("newInfo: " + newInfo);

        boolean isContains = info.contains("shit");
        System.out.println("Is contains: " + isContains);

        boolean isStartWith = name.startsWith("J");
        System.out.println("Is start with 'J': " + isStartWith);

        String[] split = info.split(" ");
        for (String s : split) {
            System.out.println("Split: " + s);
        }
    }
}

