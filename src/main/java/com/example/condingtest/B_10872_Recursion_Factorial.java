package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10872_Recursion_Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int result = 1;
        for (int i = 1; i <= a; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
