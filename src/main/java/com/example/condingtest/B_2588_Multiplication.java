package com.example.condingtest;

import java.util.Scanner;

public class B_2588_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        //a = 472;
        //b = 385;
        System.out.println(a * (b % 10));
        System.out.println(a * ((b % 100) / 10));
        System.out.println(a * (b/100));
        System.out.println(a * b);
    }
}

/*
public class Main {
    public static void main(String[] args) {

    }
}
 */

