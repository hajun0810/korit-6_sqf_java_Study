package com.study.java_study.ch15_Static;
/*
    Static 정리
    1. 공유 영역
    2. 스태틱 변수나 메소드는 클래스명. 을 통해 접근한다. // System.out.println 역시 클래스명.스태틱 구조이다.

 */
public class StaticMain01 {
    public static void main(String[] args) {
        //Static01 static01 = new Static01(); 를 하고 참조 헀어야 함
        System.out.println(Static01.num); //초기값 0
        //위 과정 생략 후 .num으로 사용
        Static01.num = 20;
        System.out.println(Static01.num); //20

        //객체 생성후 접근도 가능
        Static01 static01 = new Static01();
        static01.num = 30;
        System.out.println(Static01.num);//30
    }
}
