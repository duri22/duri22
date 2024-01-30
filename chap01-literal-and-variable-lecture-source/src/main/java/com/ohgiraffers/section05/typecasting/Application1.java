package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {


        /*
        * 데이터 형변환
        * 데이터 형변환이 필요한 이유
        * -자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        * -즉 같은 데이터 타입끼리만 연산을 수행할 수 있다.
        *
        *
        * 형변환의 종류와 규칙
        * 1. 자동 형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        * 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다.
        * 1-2. 정수는 실수로 자동 형변환 된다.
        * 1-3. 문자형은 int형으로 자동 형변환 된다.
        *
        * 2. 강제형변환(명시적 형변환) : 형변환(cast)연산자를 이용한 강제적으로 수행하는 형변환
        * 2-1. 자동형변환이 적용된지 않는 경우 강제 형변환이 필요하다.
        * */
        byte bnum = 1;
        short snum= bnum;
        int inum=snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20;
        //int result = num1+num2; 자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 담을 수 없다.
        long result = num1+num2;
        System.out.println(result);
        Integer a = num1;
        System.out.println(a.getClass());

        float fnum = 4.0f;
        double dnum = fnum;

        /*정수를 실수로 변경할 때 소수점 자리수 없이도 실수형태로 표현이 가능하다.
        * 이때 데이터 손실이 없기 때문에 자동 형변환이 가능하다*/
        int x=8;
        System.out.println(x);
        float eight = x;
        float eight2 =8;







    }
}
