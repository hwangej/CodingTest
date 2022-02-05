package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10870_Resursion_Fibonacci5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(a));

    }

    public static int fibonacci (int a){
        if (a == 0) return 0;
        if (a == 1) return 1;

        return fibonacci(a - 1) + fibonacci(a - 2);
    }
}
