package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
    /*모든 메소드 내부에는 return이 존재한다
    * void 메소드의 경우 return을 명시적으로 작성하지 않아도 컴파일러가 자동으로 추가를 해준다*/
        System.out.println("main()");
        Application5 app5;
        app5 = new Application5();
        app5.testMethod();
        System.out.println("main()");

    }
    public void testMethod(){
        System.out.println("testMethod()");

        return;// void에서 return은 컴파일러가 자동으로 추가해줌
    }

}
