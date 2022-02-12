package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2675_String_RepeatingCharacters {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); //반복횟수 받기

        for (int i = 0; i < a; i++){
            String[] str = br.readLine().split(" "); //테스트케이스 입력

            int repeatNum = Integer.parseInt(str[0]); //반복횟수
            String s = str[1]; //반복문자

            for (int j = 0; j < s.length(); j++){ //반복문자
                for (int k = 0; k < repeatNum; k++){//반복횟수
                    System.out.print(s.charAt(j)); //반복문자 출력
                }
            }
            System.out.println();
        }


    }
}
