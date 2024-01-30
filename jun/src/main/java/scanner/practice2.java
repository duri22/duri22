package scanner;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("두 자리 숫자를 입력해주세요 : ");

        int scanNum = sc.nextInt();
        String strNum = "" + scanNum;

        char tenPlace = strNum.charAt(0);
        char onePlace = strNum.charAt(1);

        String result = (tenPlace == onePlace)?"10의 자리와 1의 자리가 같습니다.":"10의 자리와 1의 다리가 다릅니다.";
        System.out.println(result);
    }
}
