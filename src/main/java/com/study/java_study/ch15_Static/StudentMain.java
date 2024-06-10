package com.study.java_study.ch15_Static;

/*
    싱글톤 디자인 패턴
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법
    2. 생성자가 private 로 외부에서는 생성할 수 없다.
    3. 같은 주소를 사용해서 하나가 바뀌면 다른쪽도 바뀐 변수로 바뀐다.
        ex) 쇼핑몰 메인홈페이지,마이페이지 포인트
 */
public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = StudentService.getInstance();
        StudentService studentService2 = StudentService.getInstance();

        studentService.addStudent();
        StudentRepository.getInstance().add("김준이");
        studentService2.addStudent();

        studentService.getStudentData();
    }
}

