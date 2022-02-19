package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_2941_String_Croatia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        String a = br.readLine();
        int count = 0;
        //크로아티아 문자열 찾기
        for (int i = 0; i < croatia.length; i++){
            if (a.contains(croatia[i])) {
                a = a.replace(croatia[i], "@");
            }
        }
        //Count
//        for (int j = 0; j < a.length(); j++){
//            if (a.charAt(j) == '@') count++;
//        }
        System.out.println(a.length());
    }
}
