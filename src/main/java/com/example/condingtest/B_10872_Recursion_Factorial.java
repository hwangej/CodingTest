package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10872_Recursion_Factorial {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int sum = factorial(a);
        System.out.println(sum);
        }

        public static int factorial(int a){
            if (a <= 1) return 1;
            return a * factorial(a-1);

    }
}
