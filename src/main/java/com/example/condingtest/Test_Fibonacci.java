package com.example.condingtest;

public class Test_Fibonacci {

    public static int fibonacciRecursive(int index){
    //피보나치 재귀로 구현
        if (index == 1){
            return 1;
        }else if (index == 2){
            return 1;
        }else{
            return fibonacciRecursive(index -1)+fibonacciRecursive(index -2);
        }
    }

    public static int fibonacciIterative(int index){
        //반복문으로 구현
        int one = 1; // 계산으로 산출되지않은 첫번째 값
        int two = 1; // 계산으로 산출되지않은 첫번째 값
        int result = -1; //결과값

        if (index == 1){
            return one;
        }else if (index == 2){
            return two;
        }else {
            for (int i = 2; i < index; i++){
                result = one + two; // 피보나치값
                one = two; //다음 덧셈을 위해 one값 세팅
                two = result; //다음 덧셈을 위해 two값 세팅
            }
        }
    return result;
    }




   public static void main(String[] args) {
       System.out.println(fibonacciIterative(3));
       System.out.println(fibonacciIterative(3));
    }
}
