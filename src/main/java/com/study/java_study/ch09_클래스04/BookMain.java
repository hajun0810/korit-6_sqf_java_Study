package com.study.java_study.ch09_클래스04;

public class BookMain {

    public static void main(String[] args) {
        // BookService 객체 생성 (기능 사용 목적)
        BookService bookService = new BookService();

        System.out.println("프로그램을 실행합니다.");
        //BookService안의 run 실행
        while(bookService.run()){}

        System.out.println("프로그램을 종료합니다.");
    }

}
