package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리 하고 sigh bit 를 반전시켜 최소값으로 순환시킴
        * */

        byte num1 = 127; //byte의 최대 저장 범위
        num1+=1;
        System.out.println(num1); // -128  : byte의 최소 저장 범위

        /*언더플로우
        * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다*/
        byte num2 = -128;
        num2-=1;
        System.out.println(num2); // 127 : byte의 최대 저장 범위


        int firstNum = 1000000;
        int secondNum = 700000;
        int multi = firstNum*secondNum;
        System.out.println(multi);
        long longMulti = secondNum*firstNum; //int값끼리 계산했기 때문에 오버플로우

        System.out.println(longMulti);
        longMulti = (long )secondNum*firstNum;
        System.out.println(longMulti);
}
}
