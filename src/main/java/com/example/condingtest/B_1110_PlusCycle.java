package com.example.condingtest;

import java.util.Scanner;

public class B_1110_PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        while(true) {
            int left = temp / 10;
            int right = temp % 10;
            temp = right * 10 + (left + right) % 10;
            count++;
            if(n == temp) {
                break;
            }
        }

        System.out.println(count);
    }
}
/*
public class Main {
    public static void main(String[] args) {

    }
}
 */
