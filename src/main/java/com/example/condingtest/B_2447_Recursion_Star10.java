package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2447_Recursion_Star10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        System.out.println(star(a));
    }

    public static int star (int a) {
        int result = 0;
        for (int i = 0; i <= a; i++){
            result *= i;


        }
        return 0;

    }

}
