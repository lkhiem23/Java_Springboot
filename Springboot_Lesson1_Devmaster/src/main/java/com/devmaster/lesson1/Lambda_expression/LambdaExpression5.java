package com.devmaster.lesson1.Lambda_expression;

//Lambda với filter

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book{
    int id;
    String name;
    float price;

    public Book(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class LambdaExpression5 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "Khiem", 9.95f));
        books.add(new Book(2, "Le", 5.95f));
        books.add(new Book(3, "Hoai", 19.95f));
        books.add(new Book(4, "Dev", 12.95f));
        books.add(new Book(5, "Devmaster", 20.95f));


        //LỌC SÁCH CÓ GIÁ TRỊ LỚN HƠN 15.000
        System.out.println("Sách có giá trị lớn hơn 15.000");
        Stream<Book> bookStream = books.stream().filter(book -> book.price >= 15);
        bookStream.forEach(System.out::println);
    }
}
