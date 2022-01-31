package com.example.condingtest;

import java.util.Scanner;

public class B_10952_APlusBver5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                sc.close();
                break;
            }
            System.out.println(a + b);
        }
    }
}
/*
public class Main {
    public static void main(String[] args) {

    }
}
 */

