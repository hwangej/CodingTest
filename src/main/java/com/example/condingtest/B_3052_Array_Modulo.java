package com.example.condingtest;

import java.util.Scanner;

public class B_3052_Array_Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        //42나눈 수 배열에 값 입력
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt()%42;
        }
       //중복값 찾기
        for (int i = 0; i < 10; i++){
            int tmp = 0;
            for (int j = i+1; j < 10; j++){
                if (a[i] == a[j]){
                    tmp++;
                }
            }
            if (tmp == 0) sum++;
        }
        System.out.println(sum);
    }
}

/*
public class Main {
    public static void main(String[] args) {

    }
}
 */