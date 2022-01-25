package com.example.condingtest;


import java.io.*;
import java.util.*;


public class B_10950_for_APlusBMinus3 {
    public static void main(String[] args) throws IOException {
/*
        Scanner sc = new Scanner(System.in);
        int t, i;
        t = sc.nextInt();
        for (i = 0;i < t; i++ ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        int t = Integer.parseInt(br.readLine());
        int[] k = new int [t];
        for (int i = 0; i < t; i++){
            String string[] = br.readLine().split(" ");
            a = Integer.parseInt( string[0]);
            b = Integer.parseInt( string[1]);
            k[i] = a+b;
        }
        //System.out.println(Arrays.toString(k));
        Arrays.stream(k).forEach(System.out::println);


    }
}
/*
public class Main {
    public static void main(String[] args) {

    }
}
 */