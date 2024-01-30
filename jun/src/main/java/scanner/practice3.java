package scanner;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력해주세요 : ");
        int money = sc.nextInt();

        int fiftyThousand = exchange(money, 50000);
        money = money - fiftyThousand * 50000;
        int tenThousand = exchange(money, 10000);
        money = money - tenThousand * 10000;
        int oneThousand = exchange(money, 1000);
        money = money - oneThousand * 1000;
        int fiveHundred = exchange(money, 500);
        money = money - fiveHundred * 500;
        int oneCoin = money;

        System.out.println("50000원 : " + fiftyThousand);
        System.out.println("10000원 : " + tenThousand);
        System.out.println("1000원 : " + oneThousand);
        System.out.println("500원 : " + fiveHundred);
        System.out.println("1원 : " + oneCoin);


    }
    public static int exchange (int money, int scale) {
        return (int)(money / scale);
    }
}
