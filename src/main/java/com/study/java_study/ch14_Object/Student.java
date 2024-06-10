package com.study.java_study.ch14_Object;
/*

        --순서-- 바뀌어도 상관은 없지만 이렇게 주로 사용함
        변수정의
        생성자
        getter,setter
        equals
        hashCode
        toString

 */

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    //getter , setter

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj.getClass() == this.getClass()){
            Student student = (Student) obj;
            return Objects.equals(student.name ,name) && Objects.equals(student.age,age);
        }
        return false;
    }

    @Override
    public int hashCode() { // 주소값
        return Objects.hash(name,age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
