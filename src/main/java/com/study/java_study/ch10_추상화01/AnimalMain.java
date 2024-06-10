package com.study.java_study.ch10_추상화01;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog(11,"콩이","말티즈");
        Animal tiger = new Tiger(5,"옹이",1000); //업캐스팅을 한다고 부모가 가지는 메서드가 실행되는 것은 아니다.
        //오버라이딩 된 매서드와 부모의 매서드를 같이 실행하기 위해서는 super.매서드명();

        dog.move();
        tiger.move();
        // 업캐스팅을 한 tiger 는 tiger가 가지는 메서드 사용 X
        ((Tiger)tiger).hunt(); //다운케스팅을 통해 hunt 메서드 사용 가능
        dog.bark();

        System.out.println();

        Animal [] animals = new Animal[3];
        animals[0] = new Animal(10,"이름 없는 동물");
        animals[1] = new Dog(11,"콩이","말티즈");
        animals[2] = new Tiger(5,"옹이",1000);

        for(Animal animal : animals){
            animal.move();
        }

        System.out.println();

        for(Animal animal: animals){
            if(animal instanceof  Tiger){
                Tiger t = (Tiger)animal;
                t.hunt();
            } else if (animal instanceof  Dog) {
                Dog d = (Dog) animal;
                d.bark();
            }

        }

        //instanceof 없이 비교하는 방법
        for(Animal animal: animals){
            if(animal.getClass() ==  Tiger.class){
                Tiger t = (Tiger)animal;
                t.hunt();
            } else if (animal.getClass() == Dog.class) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }
        System.out.println(animals[1].getClass());
        System.out.println();
        String s = "test";
        s.getClass(); //String은 객체기 때문에 getClass()가능
        int a = 10;  // 일반 자료형은 확인 불가능
        System.out.println(s.getClass());



    }
}
