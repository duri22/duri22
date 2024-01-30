package com.ohgiraffers.section02.package_and_import;
import com.ohgiraffers.section01.method.Calculater; // non static import
import static com.ohgiraffers.section01.method.Calculater.min2;
public class Application2 {
    public static void main(String[] args) {
        /*import란?
         서로 다른 패키지에 존재하는 클래스를 사용하는 경우
         매번 풀 클래스 네임을 기술하기 번거롭다
         그래서 어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해
         미리 선언하는 임포트문을 사용하면 풀 클래스네임을 매번 작성하지 않아도 된다.
        * */

        /*non-static method*/
        Calculater calc = new Calculater();
        int max=calc.max(20,40);
        int min=min2(20,40);
        System.out.println(max);
        System.out.println(min);


    }
}
