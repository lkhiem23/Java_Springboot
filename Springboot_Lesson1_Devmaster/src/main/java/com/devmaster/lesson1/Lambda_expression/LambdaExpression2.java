package com.devmaster.lesson1.Lambda_expression;

// Lambda sử dụng 1 tham số duy nhất

@FunctionalInterface
interface SayHello2{
    public void sayHello(String name);
}

public class LambdaExpression2 {
    public static void main(String[] args) {
        //Lambda sử dụng 1 tham số
        SayHello2 say1 = (name) -> {
            System.out.println("Hello " + name);
        };
        say1.sayHello("Devmaster");

        // Ngắn gọn
        SayHello2 say2 = name -> {
            System.out.println("Hello " + name);
        };
        say2.sayHello("Devmaster");

        //Ngắn gọn hơn
        SayHello2 say3 = name -> System.out.println("Hello " + name);
        say3.sayHello("Devmaster");
    }
}