package com.example.condingtest;

public class B_15596_Func_SumOfN {
    long sum(int[] a){
        long ans = 0;

        for(int i = 0; i < a.length; i++){
            ans +=a[i];
        }
        return ans;
    }
}
