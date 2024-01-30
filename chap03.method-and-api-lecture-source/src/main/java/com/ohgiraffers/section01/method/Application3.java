package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
/*argument와 parameter을 이용한 메소드 호출
* 변수의 종류
* 지역변수
* 매개변수
* 전역변수
* 클래스 변수
*
* local variables 선언한 메소드 블럭 내부에서만 사용 가능*/
        Application3 app3;
        app3= new Application3();
        int age=432;
        byte byteAge = 3;
        long longAge = 3754745;
        app3.testMethod((int)longAge);


    }
    public void testMethod(int age){
        System.out.println("You are "+age+ " years old.");
    }

}
