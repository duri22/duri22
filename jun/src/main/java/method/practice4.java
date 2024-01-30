package method;

public class practice4 {
    public static void main(String[] args) {

        int firstNum = 13;
        int secondNum = 56;
        int thirdNum = 34;

        comparison(firstNum, secondNum, thirdNum);
    }
    public static void comparison (int num1, int num2, int num3) {

        int max = Math.max(Math.max(num1, num2),num3);
        int min = Math.min(Math.min(num1, num2),num3);

        System.out.println("변수 1의 값 : " + num1);
        System.out.println("변수 2의 값 : " + num2);
        System.out.println("변수 3의 값 : " + num3);
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
