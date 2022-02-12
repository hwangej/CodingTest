package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2908_String_FILIP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //String[] str = br.readLine().split(" "); // 상수 입력

        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());// 숫자 거꾸로 저장
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        if (a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }


    }
}
