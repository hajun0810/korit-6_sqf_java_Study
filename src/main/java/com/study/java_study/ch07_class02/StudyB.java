package com.study.java_study.ch07_class02;

public class StudyB {
    //private 같은 클래스 내에서만 접근 가능
   private String name;
   private int age;

   public StudyB() {}

   public StudyB(String name, int age) {
       this.name = name;
       this.age = age;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
    }

}
