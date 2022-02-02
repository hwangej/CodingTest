package com.example.condingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B_10818_Array_MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[a];

        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        //최댓값 구하기
        int max = array[0];
        for (int i = 1; i< array.length; i++){
            if(max < array[i]) max = array[i];
        }

        //최솟값 구하기
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]) min = array[i];
        }
        System.out.println( min + " " + max);
    }
}
/*
public class Main {
    public static void main(String[] args) {

    }
}
 */