package com.ohgiraffers.section01.literal;

import java.sql.SQLOutput;

public class application2 {
    public static void main(String[] args) {
        System.out.println("====== 정수와 정수의 연산=======");
        System.out.println(123+456);
        System.out.println(123-23);
        System.out.println(123*10);
        System.out.println(123/10);
        System.out.println(123%10);
        /*
        여러
         줄
          주석
         */

        System.out.println("====== 실수와 실수의 연산=======");
        System.out.println(1.23+1.23);
        System.out.println(123-0.23);
        System.out.println(1.23*10.0);
        System.out.println(1.23%1.0); //floating point 부동소수점 오차생김
        //sout + enter 은 println 단축키;

        System.out.println("=========정수와 실수의 연산(결과는 항상 실수로 나온다)========");
        System.out.println(123+0.5);
        System.out.println(123-0.5);
        System.out.println(123*0.5);
        System.out.println(123/0.5);
        System.out.println(123%0.5);
        System.out.println("=========문자와 문자의 연산========");//문자(character)에는 아스키코드로 숫자가 배정되어서 문자끼리 계산 가능
        System.out.println('a'+'b');
        System.out.println('a'-'b');
        System.out.println('a'*'b');
        System.out.println('a'/'b');
        System.out.println('a'%'b');
        System.out.println("=========문자와 정수의 연산========");//문자(character)에는 아스키코드로 숫자가 배정되어서 숫자로 취급
        System.out.println('a'+5);
        System.out.println('a'-5);
        System.out.println('a'*5);
        System.out.println('a'/5);
        System.out.println('a'%5);
        System.out.println("=========문자와 실수의 연산========");//문자(character)에는 아스키코드로 숫자가 배정되어서 숫자로 취급
        System.out.println('a'+0.5);
        System.out.println('a'-0.5);
        System.out.println('a'*0.5);
        System.out.println('a'/0.5);
        System.out.println('a'%0.5);
        System.out.println("========문자열과 문자열의 연산=========");//문자열과 문자열은 이어붙이기
        System.out.println("사"+"과");
        System.out.println("========문자열과 다른 타입의 연산=========");//문자열과 다른 타입의 연산은 다른 타입을 문자열로 취급해서 연산
        System.out.println("배고파"+123);
        System.out.println("배고파"+0.5);
        System.out.println("배고파"+false);
        System.out.println("========문자열 형태의 숫자=======");
        System.out.println("234"+"345");
        System.out.println("======논리값 연산========");//논리값과 정수, 실수, 문자(character)의 연산은 불가능
//        System.out.println(false+0.33);
//        System.out.println(false+33);
//
//        System.out.println(false-'a'); 문자(character)은 숫자취급이기 때문에 논리값 숫자 연산과 같음
        System.out.println("======문자열(Stirng)과 불리안 연산=====");
        System.out.println("dsd "+true);//불리언 문자열이 됨
    }
}
