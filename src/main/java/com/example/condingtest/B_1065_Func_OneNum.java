package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//함수_한넘버
/*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 */
public class B_1065_Func_OneNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(h(n));

    }

    public static int h(int n){
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (i < 100) count+=1;
            if ((n/100) - ((n%10)/10) == ((n%10)/10) - (n%10) ){
                count += 1;
            }
        }
        return count;

    }
}
