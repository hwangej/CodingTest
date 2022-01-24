package com.example.condingtest;


import java.util.Scanner;

//문제  : 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다.
//입력 : 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//
//입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
//출력 : 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
public class B_2884_If_SPAVANAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour, minute;
        hour = sc.nextInt();
        minute = sc.nextInt();

        if(minute >= 45 ){
            minute -= 45;
            System.out.println(hour + " " + minute);
        }else{
            minute += 60 ;
            minute -= 45;
            if (hour-1 < 0){
                hour += 24;
                hour -= 1;
            }else{
                hour -= 1;
            }

            System.out.println(hour + " " + minute);

        }
    }
}
/*
public class Main {
    public static void main(String[] args) {

    }
}
 */
