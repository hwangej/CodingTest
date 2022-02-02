package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1546_Array_Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        double[] arr = new double[a];
        double max = 0;
        double avg = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++){
            arr[i] = Double.parseDouble(st.nextToken());
            if (arr[i] > max) max = arr[i];
        }
        br.close();
        for (int i = 0; i < arr.length; i++){
            avg += arr[i]/max*100;
        }
        System.out.println(avg/arr.length);
    }
}

/*
public class Main {
    public static void main(String[] args) {

    }
}
 */
