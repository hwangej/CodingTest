package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10809_String_FindAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] chr = str.toCharArray(); //입력받은 string을 char배열에 알파벳 한 개 저장
        int result = -1;
        for (int i = 'a'; i<= 'z'; i++){ //i a-z까지 반복
            result = -1; //-1저장
            for (int j = 0; j <str.length(); j++){ //str 배열 길이 반복
                if (chr[j] == i){ //j와 i의 char가 동일하면
                    result = j; //str의 index값 반환
            break;
                }
            }
            System.out.printf(result+ " ");

        }

    }
}
