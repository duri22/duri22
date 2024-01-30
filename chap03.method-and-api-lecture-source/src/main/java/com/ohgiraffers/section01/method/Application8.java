package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
/*static method 호출
* 클래스명.메소드명()*/
        System.out.println(Application8.add(13,4));
        System.out.println(add(13,4)); //동일한 클래스 내에 작성된 static 메소드는 클래스명 생략 가능

    }
    public static int add(int a, int b){
        return a+b;
    }
}
