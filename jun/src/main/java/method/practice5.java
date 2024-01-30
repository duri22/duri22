package method;

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {

        int languageScore = scoreCheck("국어");
        int englishScore = scoreCheck("영어");
        int mathScore = scoreCheck("수학");

        int totalScore = languageScore + englishScore + mathScore;
        double average = (double)totalScore / 3;

        System.out.println("총점은 " + totalScore + "점");
        System.out.println("평균은 " + average + "점");

    }
    public static int scoreCheck(String subject) {

        Scanner sc = new Scanner(System.in);

        System.out.print(subject + " 점수를 입력해주세요.");
        int score = sc.nextInt();
        System.out.println(subject + " 점수는 " + score + "점 입니다.");
        return score;
    }
}
