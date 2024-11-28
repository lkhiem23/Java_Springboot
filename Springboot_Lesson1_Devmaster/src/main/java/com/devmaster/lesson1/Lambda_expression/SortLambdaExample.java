package com.devmaster.lesson1.Lambda_expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLambdaExample {
    // Sắp xếp một tập hợp sử dụng collections với lambda
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java Springboot", "C#", "Python", "PHP");

        // Sắp xếp, sử dụng biểu thức lambda
        System.out.println("--- Sắp tăng ---");
        Collections.sort(list, (String str1, String str2) -> str1.compareTo(str2));
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("--- Sắp giảm ---");
        Collections.sort(list, (String str1, String str2) -> str2.compareTo(str1));
        for (String str : list) {
            System.out.println(str);
        }
    }
}
