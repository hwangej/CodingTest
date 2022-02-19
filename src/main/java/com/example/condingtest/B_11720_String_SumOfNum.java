package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11720_String_SumOfNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String b = br.readLine();
        int sum = 0;

        for (int i = 0; i < count; i++){

            sum += b.charAt(i)-48; //문자 아스키값에서 숫자 0의 아스키 값 48 빼주기
        }
        System.out.println(sum);
    }

}
