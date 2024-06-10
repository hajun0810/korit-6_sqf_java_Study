package com.study.java_study.ch11_추상화02;
/*
    추상 클래스 특징
    1. 클래스에 추상메소드가 하나라도 정의되어 있으면 추상클래스로 정의해야한다.
    2. 추상클래스는 생성할 수 없다.
    3. 일반클래스와 정의 할 수 있는 맴버변수, 맴버메소드는 동일하다. 추상클래스는 추상메소드를 정의할 수 있다.
    4. 추상클래스라고 해서 무조건 추상 메소드를 가지고 있어야 하는 것은 아니다.
    5. 추상클래스를 상속받은 클래스는 추상메소드를 모두 구현하거나 해당 클래스도 추상클래스로 정의하여야 한다.
 */
//추상화 시켜놓은 것은 되도록이면 사용하지 않는다. -> abstract를 이용하여 추상메서드로 구현
public abstract class Animal { //추상클래스

    private String name;
    public abstract void move();

    public void eat(){
        System.out.println("동물이밥을 먹습니다.");
    }

}
