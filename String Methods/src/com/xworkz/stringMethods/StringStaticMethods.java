package com.xworkz.stringMethods;

public class StringStaticMethods {
    public static void main(String[] args) {
        int num = 50;
        double pi = 3.14;
        char[] arr = {'J','a','v','a'};

        String s1 = String.valueOf(num);
        String s2 = String.valueOf(true);
        String s3 = String.valueOf(pi);

        String s4 = String.format("Value: %d", num);
        String s5 = String.format("Pi: %.2f", pi);

        String s6 = String.join("-", "Java", "is", "fun");
        String s7 = String.join(" ", "Learn", "Java");

        String s8 = String.copyValueOf(arr);
        String s9 = String.copyValueOf(arr, 1, 2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
    }
}
