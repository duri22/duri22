package scanner;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {

        int firstNum = firstNum();
        int secondNum = secondNum();

        System.out.println("첫 번째 정수 : " + firstNum);
        System.out.println("두 번째 정수 : " + secondNum);
        System.out.println("합 : " + (firstNum + secondNum));
        System.out.println("차 : " + (firstNum - secondNum));
        System.out.println("곱 : " + firstNum * secondNum);
        System.out.println("나눗셈 : " + (double)firstNum / (double)secondNum);
    }
    public static int firstNum(){

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력해주세요 : ");
        return sc.nextInt();
    }
    public static int secondNum(){

        Scanner sc = new Scanner(System.in);

        System.out.print("두 번째 정수를 입력해주세요 : ");
        return sc.nextInt();
    }
}
