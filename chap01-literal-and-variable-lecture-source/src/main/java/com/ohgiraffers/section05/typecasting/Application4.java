package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {
        /*
        * 형변환 사용 시 주의점
        * 데이터 손실에 유의해서 사용해야 한다.
        * */

        int inum=290;
        byte bnum= (byte)inum;
        System.out.println(bnum); //비트 앞부분 손실

        double height =175.5;
        int floorHeight =(int)height;

        System.out.println(floorHeight);
        height=Math.ceil(height);
        System.out.println(Math.round(3.8));



    }
}
