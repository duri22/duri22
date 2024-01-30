package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /*nextLine() : \n을 포함한 한 줄을 읽음
        * next() : 공백이나 \n 읽지 않음*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = scan.nextInt();
        System.out.println("Enter a sentence");
        String b =scan.nextLine();
        System.out.println("your number: "+a);
        System.out.println("your sentence: "+b);

        /*scan.nextInt 로 숫자를 읽고 \n은 읽지 않음
        * stack에 쌓여있던 \n을 nextLine이 읽음*/
    }
}
