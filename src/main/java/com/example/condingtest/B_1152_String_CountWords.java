package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1152_String_CountWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer를 사용하여 input  받기
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        System.out.println(st.countTokens());
    }
}
