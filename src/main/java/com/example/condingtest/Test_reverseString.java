package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_reverseString {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String reverseString(String words){
        if ((words == null) || (words.length()<= 1) ){
            return words;
        }else{
            return reverseString(words.substring(1)) + words.charAt(0);
        }

    }

    public static void main(String[] args) throws IOException {
        String a;
        a = br.readLine();
        System.out.println(reverseString(a));

    }
}
