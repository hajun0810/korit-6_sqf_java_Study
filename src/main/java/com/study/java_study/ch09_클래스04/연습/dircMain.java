package com.study.java_study.ch09_클래스04.연습;

public class dircMain {

    public static void main(String[] args) {
        dircService dircService = new dircService();

        System.out.println("프로그램을 실행합니다.");
        while(dircService.run()){}

        System.out.println("프로그램을 종료합니다.");
    }
}
