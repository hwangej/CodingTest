package com.example.condingtest;
import java.util.*;

public class Test_Stack extends Vector {

    public Object push(Object item){
        addElement(item);
        return item;
    }

    public Object pop(){
        Object obj = peek(); //stack에 저장된 마지막 요소를 읽어옴
        //Stack이 빈경우 EmptyStackException을 발생
        //마지막요소를 삭제함
        removeElementAt(size() -1);
        return obj;
    }

    public  Object peek(){
        int len = size();
        if(len == 0)
            throw new EmptyStackException();
        //마지막 요소를 반한함. 배열의 index가 0부터 시작하므로 1을 빼줌
        return  elementAt(len -1);
    }

    public  boolean empty(){
        return size() == 0;
    }

    public int search(Object o) {
        int i = lastIndexOf(o); //끝에서 부터 객체를 찾는다
        //반환값은 저장된 위치
        if (i >= 0){//객체를 찾은 경우
            return size() - i; //Stack은 맨 위에 저장된 객체의 index를 1로 정의하기때문에 계산을 통해 구함
        }
        return -1;
    }

}
