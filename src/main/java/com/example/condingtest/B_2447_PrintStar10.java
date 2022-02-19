package com.example.condingtest;

public class B_2447_PrintStar10 {
   public static String printStar(int number){
       int row= number;
       int line = number;
       String result = "";

    return ("");
   }


   public static String star(){
       int row = 3;
       int line = 3;
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
           System.out.print("");
       }
       return("");
   }

    public static void main(String[] args) {
        System.out.println(printStar(27));
        System.out.println(star());
    }
}
