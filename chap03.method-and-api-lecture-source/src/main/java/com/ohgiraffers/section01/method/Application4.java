package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
/*여러 개의 전달인자를 이용한 메소드 호출 테스트*/
        Application4 uu;
        uu= new Application4();
        String name="뽀로로";
        int age=29;
        char gender='m';
        uu.snob(name,age,gender);
        gender = 'f';
//        System.out.println(gender); //final value that has declared in method can be changed outside the method.
    }
    public void snob(String name,int age,final char gender){
        System.out.println("당신의 이름은 "+name+"이고 나이는 "+age+"이며 "+"성별은 "+gender+"이다");
        //gender='f'; //final value that has declared in method cannot be changed outside the method.


        /*매개변수도 일종의 지역변수
        *매개변수도 final 키워드 사용가능 */
    }
}
