package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
        sharkFamily("아기", "귀여운");
        sharkFamily("엄마", "어여쁜");
        sharkFamily("아빠", "힘이센");
        sharkFamily("할머니", "자상한");
        sharkFamily("할아버지","멋있는");
//        Application1 app1; //type이 Application1인 변수 생성
//        app1 =  new Application1(); //new는 object를 생성할 때 필요한거
        Application1 app2= new Application1();

    }
    public void methodA(){
        System.out.println("Calling methodA()...");

        System.out.println("methodA() completed()...");
    }

     public static void sharkFamily(String who, String trait){
        System.out.println(who+" 상어 뚜루루뚜루");
        System.out.println(trait+" 뚜루루뚜루");
        System.out.println("바닷속 뚜루루뚜루");
        System.out.println(who+" 상어!\n");
    }
}
