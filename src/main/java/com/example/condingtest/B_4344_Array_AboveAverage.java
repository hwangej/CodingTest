package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_4344_Array_AboveAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < a; i++){
            st = new StringTokenizer(br.readLine()," ");// 학생 수 및 성적 입력

            int b = Integer.parseInt(st.nextToken()); //학생수
            arr = new int[b];

            double sum  = 0;

            //성적 입력
            for (int j = 0; j < b; j++){
                int val = Integer.parseInt(st.nextToken()); //성적 저장
                arr[j] = val;
                sum += val; //성적 누적 합
            }

            double mean = (sum / b);
            double count = 0; //평균 넘는 학생 수 변수

            //평균 넘는 학생 비율 찾기
            for (int j = 0; j < b; j++){
                if(arr[j] > mean) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/b)*100);
        }


    }
}

/*
public class Main {
    public static void main(String[] args) {

    }
}
 */
