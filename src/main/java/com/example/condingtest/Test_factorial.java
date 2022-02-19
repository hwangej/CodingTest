package com.example.condingtest;

public class Test_factorial {

    public static int factorialRecursive(int number){
    //재귀구현
        if (number == 1)
            return 1;
        else{
            return number * factorialRecursive(number -1);
        }
    }

    public static int factorialIterative(int number){
    //for or while문 구현
        int sum = 1;
        for (int i = 2; i <= number; i++){
            sum *= i; // 2*3*4*5
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursive(5));
    }
}
