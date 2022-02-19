package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1157_String_StudyWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //26개 알파벳
        int[] arr = new int[26];
        String a = br.readLine();

// 대소 알파벳 판별
        for (int i = 0; i < a.length(); i++){

            if ('A' <= a.charAt(i) && a.charAt(i) <= 'Z'){
                arr[a.charAt(i) - 'A']++;
            } else {
                arr[a.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if(arr[i] > max){
                max = arr[i];
                ch = (char) (i+'A');
            }else if (arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
