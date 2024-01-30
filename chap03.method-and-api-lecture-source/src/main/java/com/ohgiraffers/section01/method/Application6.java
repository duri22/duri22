package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /*메소드는 항상 마지막에 return 명령어 존재
        * return은 자신을 호출한 곳으로 복귀해서 return
        * 그냥 복귀 할 수도 있지만 값을 가지고 복귀 할 수도 있다*/
        System.out.println("main()");

        Application6 app6;
        app6= new Application6();
        String text = app6.testMethod();
        System.out.println(text);
    }
    public String testMethod(){
        return "Hallo world";
    }
}
