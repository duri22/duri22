package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        /* AND 연산과 OR 연산의 특징
        * 논리식 && 논리식 : 얖의 결과가 false이면 뒤를 실행 안함
        *   조건식 두개가 모두 만족해야 true를 반환하기 때문에 앞에 결과가 false면 뒤 조건 확인 안함
        * 논리식 || 논리식 : 앞의 결과가 true면 뒤를 실행 안함
        *   조건식 하나만 만족하면 true를 반환하기 때문에 앞에가 true라면 바로 true를 반환*/

        //AND 연산은 앞에 false일 가능성이 높은 조건을 맨 앞에 배치하면 연산 횟수를 줄일 수 있다.
        //OR 연산은 앞에 true일 가능성이 높은 조건을 맨 앞에 배치하면 연산 횟수를 줄일 수 있다.

        int num1=10;
        int result1=(false && ++num1 > 0)? num1:-1000; //조건문이 true면 앞에거 실행, false면 뒤에거
        System.out.println(result1); //10           AND에서 앞이 false면 뒤에거 계산 안함 그래서 ++가 적용안됨

        int num2=10;
        int result2=(true||++num2>0)? num2:num2;//OR에서 앞이 true변 뒤에거 계산 안함
        System.out.println(result2);//++적용안됨
    }
}
