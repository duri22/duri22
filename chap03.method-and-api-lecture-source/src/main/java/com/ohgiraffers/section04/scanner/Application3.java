package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
/*next()로 문자열 입력받은 후 정수, 실수 ,논리값을 입력 받을 때
* */

        String str = "hello Dog";
         int index=str.indexOf(' ');
         str=str.substring(0,index); //substring 은 parameter이 하나만 있으면 beginindex 취급
        System.out.println(str);
        //System.out.println(index);
        Scanner scan = new Scanner(System.in);
        String a =scan.next();//안녕 반가워 이런 식으로 공백을 포함해서 입력하면 오류
        scan.nextLine();//얘가 공백 뒤 반가워 이런 부분 처리해줌
        int b = scan.nextInt();
        System.out.println(a+b);
    }
}
