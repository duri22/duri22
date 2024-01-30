package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
/*비교 연산자
*
* 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환함
* 삼항연산자의 조건신이나 조건문 조건절
* ==
* !=
* >=
* <=
* */
        boolean isTrue = 10<3;
       String name="Duri";
       String breed="Poodle";
       int age = 6;
       if(name.equals("Duri")&breed.equals("Poodle")&age==6){
           System.out.println("That must be Duri!!");
       }
       else {
           System.out.println("I don't think that's Duri...");
       }
char ch1='a';
       char ch2='A';
       System.out.println(ch1<ch2);
        System.out.println(ch1!=ch2);
    }
}
