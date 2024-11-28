package com.devmaster.lesson1.Lambda_expression;

// Lambda với vòng lặp

import java.util.Arrays;
import java.util.List;

public class LambdaExpression4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java SpringBoot", "C#", "PHP");

        list.forEach(item -> System.out.println(item));
        System.out.println("=====");
        list.forEach(System.out::println);
    }
}
