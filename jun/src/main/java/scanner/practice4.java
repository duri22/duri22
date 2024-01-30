package scanner;

import java.util.Random;

public class practice4 {
    public static void main(String[] args) {

        Random random = new Random();

        int firstDice = random.nextInt(5) + 1;
        int secondDice = random.nextInt(5) + 1;

        int plusDice = firstDice + secondDice;

        System.out.println("첫 번째 주사위는 " + firstDice + "가 나왔습니다!");
        System.out.println("두 번째 주사위는 " + secondDice + "가 나왔습니다!");
        System.out.println("두 주사위의 합은 " + plusDice + "입니다!");
    }
}
