package com.example.condingtest;

public class TEST_PRINTSTAR {
    public static void main(String[] args) {
        int line = 3;
        int row = 3;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < line; j++){

                if (i == 0||i == row-1){
                    System.out.print("*");
                }else{
                    if (j == 0 || j==line-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
