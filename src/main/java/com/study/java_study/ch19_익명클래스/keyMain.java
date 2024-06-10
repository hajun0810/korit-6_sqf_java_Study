package com.study.java_study.ch19_익명클래스;

public class keyMain {
    public static void main(String[] args) {

        Key attackKey = new AttackKey();
        attackKey.onKeyUp();
        attackKey.onKeyDown();

        Key customKey = new Key(){
            @Override
            public void onKeyUp() {
                System.out.println("커스텀키 뗌");
            }

            @Override
            public void onKeyDown() {
                System.out.println("커스텀키 누름");
            }
        };
        customKey.onKeyUp();
        customKey.onKeyDown();
    }
}
