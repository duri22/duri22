package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
/*매개면수와 리턴값 복합 활용*/
        Application7 app7 = new Application7();

        int first = 20;
        int second = 10;
        System.out.println( app7.add(first,second));
        System.out.println(app7.subtract(first,second));
        System.out.println(app7.multiple(first,second));

    }
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiple(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
}
