package com.study.java_study.ch10_추상화01;

public class Animal {
    private int age;
    private String name;

    public Animal() {
        System.out.println("동물 객체 생성");
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void move(){
        System.out.println("동물이 움직입니다.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
