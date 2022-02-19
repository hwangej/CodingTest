package com.example.condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1316_String_GroupVocaChecker {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int a = Integer.parseInt(br.readLine()); // 입력 단어 개수
        int count = 0; // 그룹단어 개수
        for (int i = 0; i < a; i++){
            if (checkWord() == true){
                count++;
            }
        }
        System.out.println(count);

    }

    public  static boolean checkWord() throws IOException{
        boolean[] alp = new boolean[26]; //알파벳 개수만큼 배열 생성
        int prevNum = 0;
        String s = br.readLine();

        for (int i = 0; i< s.length(); i++){
            int now = s.charAt(i); //i 번째 문자 저장


            if (prevNum != now){//이전문자와 i 번째 문자가 같은지 확인

                // 앞 문자와 i번째 문자가 다른 경우
                if (alp[now - 'a'] == false){ //해당 문자가 처음인 경우
                    alp[now - 'a'] = true;  //true로 변경
                    prevNum = now; //이전문자를 현재 문자로 변경


                }else{ //문자가 이미 나온 경우(중복건)
                    return false;//종료
                }


            }
            // 앞의 문자와 i번째 문자 동일한 경우
            else{
                continue;
            }
        }
        return true;

    }


}
