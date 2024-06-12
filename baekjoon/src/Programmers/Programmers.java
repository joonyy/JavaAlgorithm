package Programmers;

import java.util.*;

public class Programmers {
    public static void main(String[] args) {
        int[] answer = {};
        int[] arr = {1,1,3,3,0,1,1};

        Stack<Integer> tmp = new Stack<Integer>();
        for(int i=0; i<arr.length;i++){
            tmp.push(arr[i]);
            System.out.println(i+"번째 반복");
            System.out.println("tmp 배열의 값은 : "+tmp);
            if(tmp.size() > 1){                 //tmp에 항목이 있을 때
                System.out.println("if문 진입.");
                int before = tmp.pop();         //before 로 맨 뒤에 꺼내기
                int after = tmp.pop();          //after 로 (맨 뒤 - 1) 값 꺼내기
                System.out.println("before : "+ before);
                System.out.println("after : "+ after);
                System.out.println("tmp : "+tmp);
                if(before == after){            //만약에 before 랑 after랑 같으면
                    System.out.println("before==after if문 진입");
                    tmp.push(after);            //before는 버리고 after만 넣어줘
                    System.out.println("찐 tmp : "+tmp);
                }
                else{                           //before 랑 after랑 다르면
                    System.out.println("before!=after else문 진입");
                    tmp.push(after);
                    tmp.push(before);           //before 랑 after 다시 순서 맞춰서 넣어줘
                    System.out.println("찐 tmp: "+tmp);
                }
            }
        }
        System.out.println(tmp);
    }
}