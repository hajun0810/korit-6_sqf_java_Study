package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA{
    @Override
    public void print(InterfaceA interfaceA) { //DI: 외부에서 interfaceA를 받아 사용해야 하므로 의존성 객체
        System.out.println("A1 클래스에서 print 호출");
        interfaceA.test();
    }
}
