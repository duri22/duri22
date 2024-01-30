package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /*강제 형변환
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다
        * 예) (바꿀자료형) 값;
        *
        * 강제 형변환 규직
        * 1.큰 자료형에서 작은 자료형으로 변견 시 강제 형변환이 필요하다.
        * 2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
        * 3.문자형을 int미만 크기에 변수에 저장할 때 강제 형변환이 필요
        * 강제 형변환은 데이터 손실 감안하고 하는 것임
        * */

        long lnum = 8;
        //int inm = lnum;  데이터 손실 가능성을 컴파일러가 알려준다 (에러)
        int inum = (int)lnum;

        double dnum = 8.0;
        //float fnum = dnum; 데이터 손실 가능성을 컴파일러가 알려준다 (에러)
        float fnum = (float)dnum;

        double q=42.4324; //정수는 실수로 자동 형변환 되지만 실수는 정수로 형변환하려면 cast를 해야하고 소수점은 없어진다.
        int p=(int)q;
        System.out.println(q);


        char ch ='a';
        byte bnum2 = (byte)ch; //당연히 char 자료형보다 작은 크기이니 강제형변환
        short snum2 = (short)ch; //같은 2byte지만 부호비트(sign bit) 로 인한 값의 범위가 다르기 때문



    }
}
