package com.ohgiraffers.section05.typecasting;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리 된다
        * */

        int inum =10;
        long lnum =100;

        //int isum = inum+lnum; //두 자료형의 연산 결과는 더 큰 쪽 자료형인 long이 되고, long형 값은 int형 변수에 담길 수 없다
        int isum = inum+(int)lnum;
        int isum2 = (int)(inum+lnum);
        long isum3 = inum+lnum;  //결과 값을 long 타입으로 자동형변환

        //byte 미만 자료형의 합은 int
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;


        int a = byteNum1+shortNum1;


    }
}
