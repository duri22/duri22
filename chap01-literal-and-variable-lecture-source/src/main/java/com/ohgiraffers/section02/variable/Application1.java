package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        /*변수의 사용 목적
        * 값에 의미를 부여(의미전달)
        * 값 재사용
        * 시간에 따라 변하는 값 저장*/
        int salary  =100000;
        int bonus = 200000;
        int point = 100;
        System.out.println("=테스트=");
        System.out.println("보너스를 포함한 급여 : "+(salary+bonus)+"원");
        for(int i=1;i<6;i++){
            System.out.println(i+"번 고객에게 포인트를 "+point+"포인트 지급하였습니다");
        }
        System.out.println("=번수에 지정된 값 변경 테스트=");//변수는 하나의 값보다 변하는 값을 저장하기 위한 공간이다.
        int sum = 0;
        sum = sum+10;
        sum = sum+10;
        System.out.println(sum);
    }
}
