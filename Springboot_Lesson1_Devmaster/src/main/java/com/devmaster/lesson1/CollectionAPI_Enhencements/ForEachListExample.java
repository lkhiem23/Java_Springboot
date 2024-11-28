package com.devmaster.lesson1.CollectionAPI_Enhencements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachListExample {
    public static void main(String[] args) {
        List<String> language = Arrays.asList("Java Spring", "C#", "Python", "PHP");

        System.out.println("Sử dụng biểu thức Lambda: ");
        language.forEach(lang -> System.out.println(lang));

        System.out.println("-------------------------------");

        System.out.println("Sử dụng method reference: ");
        language.forEach(System.out::println);
    }
}
