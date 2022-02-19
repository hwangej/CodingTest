package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11654_ASCII {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a;
        a = br.readLine().charAt(0);
        int ia = (int) a;
        System.out.println(ia);
        br.close();
    }
}
