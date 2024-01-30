package com.ohgiraffers;

public class dog {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String result = (a>b)? "두 수 중 큰 수는 "+a+"입니다." : "두 수 중 큰 수는 "+b+"입니다.";
        System.out.println(result);

        int score =76;
        String result2 = (score>=60)? "합격입니다" : "불합격입니다";
        System.out.println(result2);

        int num=23;
        String result3= (num%2==0)? "짝수입니다":"홀수입니다";
        System.out.println(result3);

        double score2= 79.2;
        int iScore2=(int)score2;

        String result4 = (iScore2>=90)? "A" : (iScore2>=80)? "B" : (iScore2>=70)? "C":(iScore2>=60)? "D":"F";
        System.out.println(result4);

        int month =9;
        int day = 24;
//        String bmonth = (1<=month&&month<=6)? "bornIn1_6" : "bornIn7_12";
//        String bday = (1<=day&&day<=15)? "bornIn1_15" : "bornIn16_31";
//        String present = (bmonth=="bornIn1_6"&&bday=="bornIn1_15")? "배민 쿠폰" : (bmonth=="bornIn7_12"&&bday=="bornIn16_31")? "스타벅스 커피" : "사탕";
//        System.out.println(present);

        String result5 = (1<=month && month<=6) && (1<=day && day<=15)? "배민쿠폰" :(7<=month && month<=12) && (16<=day && day<=31)? "스타벅스" : "사탕";

        System.out.println(result5);









    }


}
