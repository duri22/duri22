package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 논리 연산자의 종류
        * 논리 연결 연산자
        * 두 개의 논리식을 판단하여 참과 거짓을 판단
        * 1. &&(AND) 두 값이 모두 참일 때 true 반환
        * 2.||(or) 두 값 중 하나가 참일 경우 true
        * 논리 부정 연산자(단항 연산자)
        * 1. !(NOT) 참이면 거짓을 거짓이면 참을 반환
        *
        * *

         */
        System.out.println(true&&false);
        System.out.println(true || false);
        System.out.println(!true);
        System.out.println(!false);

        /*논리식에 논리 연산자 활용*/
        int a=1;
        int b=2;
        int c=3;
        int d=4;

        System.out.println("a<b & c<d? : "+ (a<b && c<d));
        System.out.println("a<b & c>d? : "+ (a<b && c<d));
        System.out.println("a>b & c>d? : "+ (a<b && c<d));

        System.out.println("a<b or c<d? : "+ (a<b || c<d));
        System.out.println("a<b or c<d? : "+ (a<b || c>d));
        System.out.println("a<b or c<d? : "+ (a>b || c>d));
    }
}
