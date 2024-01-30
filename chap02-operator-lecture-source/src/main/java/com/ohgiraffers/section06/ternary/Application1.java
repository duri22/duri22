package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {
/*삼항 연산자
* 자바에서 유일하게 피연산자 항목이 3개인 연산자다*.
(조건식)? 참일 때 사용할 값 : 거짓일 때 사용할 값/
 */

        int num1 =10;
        int num2=-10;
        String result = (num1>=0)? "positive num": "negative num";
        String result2 = (num2>=0)? "positive num": "negative num";

        System.out.println(result);
        System.out.println(result2);

        /*삼항 연산자 중첩 사용*/
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3>0)? "양수" : (num3 ==0)? "0" : "음수"; //true면 앞의 값("양수")을 반환, false면 뒤의 연산자를 반환
        String result4 = (num4>0)? "양수" : (num4 ==0)? "0" : "음수";
        String result5 = (num5>0)? "양수" : (num5 ==0)? "0" : "음수";
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        nya("두리");

    }
    static void nya(String name){
        System.out.println("안녕하냐 "+name);
    }
}
