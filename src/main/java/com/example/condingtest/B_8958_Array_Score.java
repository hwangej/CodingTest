package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_8958_Array_Score {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] arr = new String[a];

        for (int i = 0; i < arr.length; i++){
            arr[i] = br.readLine();
        }

        for (String b : arr){
            int plus = 0;
            int sum = 0;
            for( int j = 0; j < b.length(); j++){
                if(b.charAt(j) == 'O'){
                    plus++;
                }else {
                    plus = 0;
                }
                sum += plus;
            }
            System.out.println(sum);
        }




    }
}
/*
public class Main {
    public static void main(String[] args) {

    }
}
 */