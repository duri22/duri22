package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        /*API란?
        * Application Programming Interface
        * 운영체제, 프로그래밍 언어가 제공하는 인터페이스
        * JDK를 설치하면 사용할 수 있도록 제공하는 소스코드*/
        /*Math 클래스*/

        System.out.println(java.lang.Math.abs(-34));
        /*Math class는 java.lang 패키지에 속한 클래스이기 때문에  import를 하지 않아도  된다
        * 모든 메소드는 static메소드로 작성되어 있다*/
        Random rand = new Random();
        int a = rand.nextInt(10,20);
        System.out.println(a);
        //System.out.println(Math.random());
    }
}
