package com.study.java_study.ch10_추상화01;

public class Dog extends Animal{  //상속 : 기존의 자료형에 새로운 값을 추가하여 새로운 자료형을 만드는 확장 개념
    private String breed;

    public Dog() {
        super();// 생략되어있음 , 부모객체 생성자 호출
        System.out.println("강아지 객체 생성");
    }

    public Dog(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }

    @Override
    public void move() {
        System.out.println("강아지가 네발로 움직입니다.");
    }

    public void bark(){
        System.out.println(breed+"종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} ";
    }
}
