package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        int first = 100;
        int second =50;
        /*non-static 메소드의 경우
        * 클래스가 다르더라도 사용하는 방법은 동일
        * 클래스명 사용할이름 = new 클래스명();
        * 사용할이름.메소드명*/

        Calculater calc = new Calculater();
        int min=calc.min(first, second);
        System.out.println(min);
        /*static 메소드의 경우 호출할 때 클래스명을 반드시 기술
        * 클래스명.메소드명()*/
        int min2 = Calculater.min2(first, second);

        System.out.println(min2);

        int max = calc.min2(first, second); //static method는 static에 접근하는ㄴ 방법을 사용하라고 경고 메세지
    }
}
