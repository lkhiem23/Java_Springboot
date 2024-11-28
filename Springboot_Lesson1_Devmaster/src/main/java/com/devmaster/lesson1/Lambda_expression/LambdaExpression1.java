package com.devmaster.lesson1.Lambda_expression;

// Lambda không có tham số

@FunctionalInterface
interface SayHello1{
    void sayHello();
}

public class LambdaExpression1 {
    public static void main(String[] args) {
        SayHello1 sayHello = () -> {
            System.out.println("Hello Lambda");
        };
        sayHello.sayHello();
    }
}
