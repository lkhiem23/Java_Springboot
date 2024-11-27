package com.devmaster.lesson1.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    List<Integer> integerList = Arrays.asList(11, 22, 31, 41, 52, 61);
    // Đếm các số chẵn

    // Không dùng stream
    public void withoutStream(){
        int count = 0;
        for(Integer integer : integerList){
            if(integer%2 == 0){
                count++;
            }
        }
    }

    // Dùng stream
    public void withStream(){
        long count = integerList.stream().filter(integer -> integer%2 == 0).count();
        System.out.println("Số phần tử chẵn:  " + count);
    }

    public static void main(String[] args) {
        StreamExample streamExample = new StreamExample();
        streamExample.withStream();
        streamExample.withoutStream();
    }
}