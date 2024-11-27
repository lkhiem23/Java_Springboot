package com.devmaster.lesson1.pkg_defaultMethod;

public interface Shape {
    void Draw();

    default void setColor(String color) {
        System.out.println("Color: " + color);
    }
}
