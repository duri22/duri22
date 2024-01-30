package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        /*Random class의 nextInt*/
        Random rand = new Random();
        System.out.println(rand.nextInt(30)); //0부터 29까지
        System.out.println(rand.nextInt(10,20));
    }
}
