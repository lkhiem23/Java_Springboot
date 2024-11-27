package com.devmaster.lesson1.pkg_defaultMethod;

public interface Interface1 {
    default void method1() {
        System.out.println("Interface1.method1");
    }
}
