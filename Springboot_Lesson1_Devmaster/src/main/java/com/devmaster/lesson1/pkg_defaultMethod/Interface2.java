package com.devmaster.lesson1.pkg_defaultMethod;

public interface Interface2 {
    default void method2() {
        System.out.println("Interface2.method2");
    }
}
