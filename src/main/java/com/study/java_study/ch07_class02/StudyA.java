package com.study.java_study.ch07_class02;

public class StudyA {
    int num;
    int num2;

    // 생성자
    // 1. 클래스 명과 동일하다.
    // 2. 리턴 자료형이 없다.
    // 3. 생성자는 무조건 할당된 메모리의 주소를 리턴한다.

    // NoArgsConstructor , 매개변수가 없는 생성자
    StudyA(){
        System.out.println("스터디 에이 객체 생성");
    }

    //ALLArgsConstructor
    StudyA(int num , int num2){
        System.out.println("스터디a 객체 생성");
        this.num = num; // this = 자기자신의 주소
        this.num2 = num2;
    }




    void increase(int increaseNum){
        num += increaseNum;
        num2 += (increaseNum*2);
    }

    void decrease(int decreaseNum){
        num -= decreaseNum;
        num2 -= (decreaseNum*2);

    }


}
