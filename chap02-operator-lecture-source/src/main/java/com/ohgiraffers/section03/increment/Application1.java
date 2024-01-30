package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {
        /*
        * ++ : 1증가
        * -- : 1감소*/

        int num=10;
        num--;
        System.out.println(num);

        /*주의사항
        * 다른 연산자와 함께 사용할 때 의미가 달라진다
        *
        * var++ : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
        * ++var : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함*/

        int firstNum =20;
        int result1 = firstNum++ * 3; // *3이 result1에 들어가고 그다음 firstNum이 계산돼서 60이 나옴
        System.out.println(result1);

        ++firstNum; //먼저 증가하고 다른 식을 계산
    }

}
