package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        //제네릭 와일드 카드 (기호 : ?)
        //변수 선언만 먼저 하고 싶을때 자료형이 정해지지 않으면 <?>로 정의 가능 :
        // <Object>이지만 기호로 정의


        Message<?> m1 ;
        Message<String> m2 =null;

        m1 = new Message<>("1");
        // 와일드카드를 사용하지만 Object 이기 때문에 다운캐스팅 필요
        String s = (String)m1.getMessage();


        //와일드 카드 제약
        //String class를 상속 받거나 String 인 경우에만 ?에 들어올 수 있다.
        Message<? extends String> m3 = new Message<>("10"); // 하행
        //String class를 상속하거나 String인 경우에만 ?에 들어올 수 있다.
        Message<? super String> m4 = new Message<>(new Object()); // 상행

        String s2 = m3.getMessage();
    }
}
