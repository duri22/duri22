package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {
        System.out.println("main() has started..");
        Application2 app2;
        app2=new Application2();
        app2.methodA();
        app2.methodB(); //static 안하는건 object를 생성하지 않고 method를 부르지 못하게 하려고?
        Application2 app = new Application2();

    }
    public void methodA(){
        System.out.println("methodA 호출됨");
        System.out.println("methodB 종료됨");
    }
    public void methodB(){
        System.out.println("methodB 호출됨");
        System.out.println("methodA 종료됨");
    }
    }

