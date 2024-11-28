package com.devmaster.lesson1.Method_References;

// CÚ PHÁP VIẾT TẮT CỦA LAMBDA ĐỂ GỌI PHƯƠNG THUC

import java.util.Arrays;

@FunctionalInterface
interface ExcuteFunction{
    public int execute(int a, int b);
}

class MathUtils{
    public MathUtils(){

    }
    public MathUtils(String str){
        System.out.println("MathUtil: " + str);
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int minus(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;

    }
    public static int divide(int a, int b){
        return a/b;
    }
}

public class DemoMethodRef {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // THAM CHIẾU ĐẾN MỘT INSTANCE METHOD CỦA MỘT ĐỐI TƯỢNG CỤ THỂ

        int sum = doAction(a,b,MathUtils::sum);
        System.out.println(a+ " + " + b + " = " + sum);

        int minus = doAction(a,b,MathUtils::minus);
        System.out.println(a + " - " + b + " = " + minus);

        int multiply = doAction(a,b,MathUtils::multiply);
        System.out.println(a + " * " + b + " = " + multiply);

        int divide = doAction(a,b,MathUtils::divide);
        System.out.println(a + " / " + b + " = " + divide);

        System.out.println("--------------");
        // THAM CHIẾU ĐẾN MỘT INSTANCE METHOS CỦA MỘT ỐI TƯỢNG TÙY Ý CỦA MỘT KIỂU CỤ THỂ

        String[] stringArrays = {"Java Springboot", "PHP", "C#", "Python"};
        Arrays.sort(stringArrays, String::compareToIgnoreCase);
        for(String s : stringArrays){
            System.out.println(s);
        }

    }

    private static int doAction(int a, int b, ExcuteFunction func) {
        return func.execute(a,b);
    }
}
