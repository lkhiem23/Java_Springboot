package com.devmaster.lesson1.Lambda_expression;

//Lambda có nhiều tham số
@FunctionalInterface
interface Calculator1{
    int add(int a, int b);
}
@FunctionalInterface
interface Calculator2{
    void add(int a, int b);
}

public class LambdaExpression3 {
    public static void main(String[] args) {
        // KỂU INT
        Calculator1 calc1 = (int a, int b) -> (a + b);
        System.out.println(calc1.add(10, 20));

        Calculator1 calc2 = (a,b) -> (a+b);
        System.out.println(calc2.add(5,10));

        // KIỂU VOID
        Calculator2 calc3  = (a,b) -> System.out.println(a+b);
        calc3.add(12,20);

        Calculator2 calc4 = (a,b) -> {
            int sum = a+b;
            System.out.println(a+" + "+b+" = "+sum);
        };
        calc4.add(12,12);
    }
}
