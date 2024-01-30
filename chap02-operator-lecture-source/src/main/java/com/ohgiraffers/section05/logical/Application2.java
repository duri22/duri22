package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {
/*논리 연산자의 우선순위
* && 11순위
* || 12순위
* */


        int num1= 55;
        int num2 = 175;
        System.out.println("1부터 100사이? : "+(1<=num1 && num1<=100));
        System.out.println("1부터 100사이? : "+(1<=num2 && num2<=100));

        char ch ='R';
        System.out.println("Capital? : "+('A'<=ch && ch<= 'Z'));
        char ch2 ='z';
        System.out.println("Capital? : "+('A'<=ch2 && ch2<= 'Z'));

        /*대소문자 상관없이 확인*/
        char ch3 = 'X';
        System.out.println(ch3=='x' || ch3=='X');

        /*영문자인지 확인*/

        char ch4 = 'w';
        System.out.println(('a'<=ch4 && ch4<='z')||('A'<=ch4 && ch4<='Z'));


    }


}
