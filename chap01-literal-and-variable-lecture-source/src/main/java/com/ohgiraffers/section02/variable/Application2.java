package com.ohgiraffers.section02.variable;

public class Application2
{
    public static void main(String[] args) {
        /*변수를 사용하는 방법
        * 1.변수 선언
        * */
        /*자료형이란?
        * 다양한 값의 형태별로 어느 정도 크기를 하나의 값으로 취급할 것인지 미리 컴파일러와 약속한 키워드이다
        * 예) 앞에서 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        * 이려한 자료형은 자본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다*/

        /*정수를 취급하는 자료형 4가지*/
        byte bnum; //1byte
        short snum; //2byte
        int inum; //4byte
        long lnum; //8bite

        /*실수를 취급하는 자료형은 2가지가 있다*/
        float fnum; //4bite
        double dnum; //8bite

        /*문자를 취급하는 자료형은 1가지*/
        char ch; //2byte
        char ch2;
        /*논리값*/
        boolean isTrue;

        bnum = 1;
        snum = 2;
        inum = 4;
        //lnum = 8;  아무 문제 없을 듯 하지만 사실 대문자 L필요
        lnum = 8L;

        //fnum =4.0; //java는 실수를 기본적으로 double로 저장하기 때문에 float을 쓴다면 f를 붙여야 한다.
        fnum =4.0f;
        dnum = 4.0;

        ch='a';
        ch2 = 97; //character은 사실 숫자(ASCII)이기 때문에. ch2를 출력하면 소문자 a가 출력한다.

        isTrue = false;
        isTrue = true;
        /*문자열 자료형 (기본자료형 아님)*/
        String str;

        /*숫자로 된 형태의 값을 그대로 사용하는 자료형은 byte, short, int, double이다*
        일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형으로 하며
        정수형은 int, 실수형은 double이 대표 자료형이다./
         */
        int point = 100;
        int bonus = 10;

        System.out.println(bnum);
        System.out.println(snum);
        System.out.println(inum);
        System.out.println(lnum);

        System.out.println(fnum);
        System.out.println(dnum);
        System.out.println(ch);
        System.out.println(ch2);

        System.out.println(point + bonus);



    }


}
