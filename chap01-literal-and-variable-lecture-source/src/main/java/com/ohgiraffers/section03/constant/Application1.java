package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        /*변수가 메모리에 뱐경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념이다
        * 번하지 않는 값을(항상 고정된 값) 저장해두기 위한 메모리상의 공간을 상수라고 한다=
        *
        * 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하게 한다.
        * 예)수학 공식에 사용되는 쉬 등
        *
        *
        *
        * 사용방법
        * 1.상수를 선언한다(변수 선언과 유사하지만 final 키워드를 사용함)
        * 2.값을 초기화 한다(초기화 이후에는 값 변경 불가능)*/

        final int AGE;
        AGE = 10;
        //AGE = "5"; 변경불가

        int sum = AGE+10; //
    }
}
