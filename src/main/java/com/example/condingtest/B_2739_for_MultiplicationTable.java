package com.example.condingtest;

import java.util.Scanner;

public class B_2739_for_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        n = sc.nextInt();

        for (i = 1; i < 10; i++ ){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}

/*
public class Main {
    public static void main(String[] args) {

    }
}
 */
