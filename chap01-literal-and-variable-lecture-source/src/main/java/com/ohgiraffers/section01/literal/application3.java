package com.ohgiraffers.section01.literal;

public class application3 {
    public static void main(String[] args) {
        System.out.println("==두개의 문자열 합치기==");
        System.out.println(9 + 9);
        System.out.println("9" + "9");
        System.out.println("9" + 9);
        System.out.println("9" + 9);

        System.out.println("==3개의 문자열 합치기==");
        System.out.println("9" + 9 + 9);
        System.out.println("9" + (9 + 9));

        System.out.println("==10과 20의 사칙연산==");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("==10과 20의 사칙연산 보기좋게==");
        System.out.println("10과 20의 합은 " + (10 + 20) + "입니다");//괄호 없으면 문자열로 계산
        System.out.println("10-20=" + (10 - 20));
        System.out.println("10*20=" + (10 * 20));
        System.out.println("10/20=" + (10 / 20));
        System.out.println("10%20=" + (10 % 20));

        System.out.println("기차가 칙칙폭폭 속도는 " + 100 + "km/s");//여기서 100은 string화 됨
        System.out.println('+' - 0.5);

        System.out.println("===================================================\n");



    }

}

