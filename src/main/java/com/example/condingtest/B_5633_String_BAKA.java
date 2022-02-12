package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5633_String_BAKA  {

    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); // input String
        int k = str.length(); // String 길이
        int count = 0;
        for (int i = 0; i < k ; i++){
            switch (str.charAt(i)){
                case 'A': case 'B': case 'C':
                    count += 3;
                    break;

                case 'D': case 'E': case 'F' :
                    count += 4;
                    break;

                case 'G': case 'H': case 'I' :
                    count += 5;
                    break;

                case 'J': case 'K': case 'L' :
                    count += 6;
                    break;

                case 'M': case 'N': case 'O' :
                    count += 7;
                    break;

                case 'P': case 'Q': case 'R': case 'S' :
                    count += 8;
                    break;

                case 'T': case 'U': case 'V' :
                    count += 9;
                    break;

                case 'W': case 'X': case 'Y' : case 'Z' :
                    count += 10;
                    break;

            }
        }
        System.out.println(count);
    }
}
