package com.study.java_study.ch11_추상화02;

public class AnimalMain {
    public static void main(String[] args) {
        // Animal a = new Animal(); 추상 클래스는 생성할 수 없다.


        Animal [] animals = new Animal[10];
        for(int i =0;i<animals.length;i++){
            animals[i] = i % 2 == 0 ? new Dog() :new Tiger();
        }

        for(Animal animal: animals){
            animal.move();
        }
    }
}
