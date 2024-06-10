package com.study.java_study.ch14_Object;

import java.util.Objects;

/*
    Object 클래스(최상위 클래스)
    모든 자료형을 업캐스팅 할 수 있다.

 */
public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("학생",21); //모든 클래스들은 최상위가 Object 이다 (상속 받는다)
        Student student2 = new Student("학생",21);
        Object [] objects = new Object[3];
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("학생",21);

        //toString() 생략 가능 , 변수명만 입력해도 toString 출력
        System.out.println(student);
        String str = new String("데이터");
        System.out.println(str.toString());

        // String studentData = student; // 불가능 student 가 String 타입이 아니기때문
        String studentData = student.toString(); //student 는 그냥 주소값

        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(Objects.hash("김준일"));
        System.out.println(Objects.hash("김준일"));
    }
}
