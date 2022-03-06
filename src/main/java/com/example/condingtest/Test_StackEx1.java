package com.example.condingtest;

import java.util.Stack;

public class Test_StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.네이버");
        goURL("2.다음");
        goURL("3.티스토리");
        goURL("4.깃헙");

        printStatus();

        goBack();
        System.out.println("==뒤로==");
        printStatus();

        goBack();
        System.out.println("==뒤로==");
        printStatus();

        goForward();
        System.out.println("==앞으로==");
        printStatus();

        goURL("BaekJoon.com");
        System.out.println("==새로운주소==");
        printStatus();

    }


    public static void printStatus(){
        System.out.println("back:"+back);
        System.out.println("forward:"+forward);
        System.out.println("현재화면은 '"+back.peek()+"'입니다.");
        System.out.println();
    }



    public static void goURL(String url){
        back.push(url);
        if (!forward.empty())
            forward.clear();
    }

    public static void goForward(){
        if(!forward.empty())
            back.push(forward.pop());
    }

    public  static void goBack(){
        if (!back.empty())
            forward.push(back.pop());
    }
}
