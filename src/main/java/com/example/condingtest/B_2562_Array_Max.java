package com.example.condingtest;

import java.util.Scanner;

public class B_2562_Array_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] maxArray = new int[9];
        int max = 0;
        int index = 0;
        // 배열 값 입력
        for (int i = 0; i < maxArray.length ; i++){
            maxArray[i] = sc.nextInt();

            if (maxArray[i] > max) {
                max = maxArray[i];
                index = i + 1;
            }
        }
        System.out.println(max + "\n" +index);
    }
}

/*
public class Main {
    public static void main(String[] args) {

    }
}
 */
