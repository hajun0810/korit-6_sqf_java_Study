package com.study.java_study.ch16_제네릭;


public class SenderMain {
    public static void main(String[] args) {

        Integer num = new Integer(10); // 박싱: 10(int)를 10(Integer)로 바꿈
        int num2 = num.intValue(); // 언박싱: int num을 Integer로 바꿈

        //자바에서는 자동으로 언박싱을 해줘서 생략 가능
        Integer num3 = 20; //자동 박싱
        int num4 = num3; // 자동 언박싱

        Sender<Integer,String,Double> sender1 = new Sender<>(10,"20",3.14);

    }
}
