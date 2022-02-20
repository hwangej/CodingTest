package com.example.condingtest;

import java.util.ArrayList;
import java.util.List;

public class Test_List {
    public static void main(String[] args) {
        //ArrayList
        int size;
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        System.out.println("index 1의 값 : "+list.get(1));
        list.add(1,"J");

        size = list.size();
        System.out.println("저장된 객체 수 : " + size);
        for (int i = 0; i < size; i++) System.out.println(list.get(i));
    }
}
