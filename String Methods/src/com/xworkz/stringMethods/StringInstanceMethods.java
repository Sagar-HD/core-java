package com.xworkz.stringMethods;

public class StringInstanceMethods {
    public static void main(String[] args) {
        String str = "  hello java world  ";
        String str2 = "HELLO JAVA WORLD";

        System.out.println(str.length());
        System.out.println(str.isEmpty());


        System.out.println(str.charAt(2));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 7));
        System.out.println(str.subSequence(2, 7));

        System.out.println(str.equals("hello java world"));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.compareTo(str2));

        System.out.println(str.contains("java"));
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("o", 5));
        System.out.println(str.lastIndexOf("o"));

        System.out.println(str.startsWith("  he"));
        System.out.println(str.endsWith("ld  "));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.trim());


        System.out.println(str.replace("java", "python"));
        System.out.println(str.replaceAll("a", "@"));
        System.out.println(str.replaceFirst("l", "L"));

        String[] parts = str.trim().split(" ");
        for (String s : parts) {
            System.out.println(s);
        }

        System.out.println(str.concat("!!!"));


        char[] chars = str.toCharArray();
        System.out.println(chars.length);

        byte[] bytes = str.getBytes();
        System.out.println(bytes.length);
    }
}
