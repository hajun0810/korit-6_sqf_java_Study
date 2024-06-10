package com.study.java_study.ch07_class02;

public class StudyMain {
    public static void main(String[] args) {
        StudyA a = new StudyA(100,1000);
        System.out.println(a.num);
        System.out.println(a.num2);

        // b.name가 안되는 이유는 String name이 private로 지정되어 있기 때문.


    }
}
