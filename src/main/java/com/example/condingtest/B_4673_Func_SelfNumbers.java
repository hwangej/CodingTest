package com.example.condingtest;

import java.io.IOException;

//브루트포스 알고리즘
/*
문제풀이
1. 10001의 배열 생성
2. 10의자리와 1의자리를 나눈 값 index를 True로 입력
3.빈 배열의 index 출력
 */
public class B_4673_Func_SelfNumbers {
    public static void main(String[] args) throws IOException {
        // sum 값 받아 출력하기
        Boolean arr[] = new Boolean[10001]; //boolean표현할 배열 생성
/* //아래 for문과 차이점....이 뭔지.....?
        for (int i = 0; d(i) <= 10000; i++) {
            arr[d(i)] = Boolean.TRUE;
        }
*/
        for(int i = 0; i < 10001; i++){
            int n = d(i);

            if(n < 10001){
                arr[n] = true;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == Boolean.TRUE) continue;
            System.out.println(j);
        }

    }

    //d(n) 값 구하기
    public static int d(int a) {
        int sum = a;

        while (a != 0) {
            sum += a % 10;
            a = a/10;
        }
        return sum;
    }
}
