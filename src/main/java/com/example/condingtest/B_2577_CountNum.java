package com.example.condingtest;

import java.util.Scanner;

public class B_2577_CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int a,b,c,multiple;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        multiple = a * b * c;
        while (multiple > 0){
            arr[multiple%10]++;
            multiple /= 10;
        }
        for (int i = 0; i<10; i++)
            System.out.println(arr[i]);
    }
}

/*
public class Main {
    public static void main(String[] args) {

    }
}
 */
