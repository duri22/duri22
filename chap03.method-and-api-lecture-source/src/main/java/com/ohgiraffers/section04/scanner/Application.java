package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your name : ");
        String a=scan.nextLine();
        System.out.println(a);

        char b= scan.nextLine().charAt(0); //nextChar같은건 없기 때문에 문자를 스캔하려면 이렇게 해야한다.


    }


}
