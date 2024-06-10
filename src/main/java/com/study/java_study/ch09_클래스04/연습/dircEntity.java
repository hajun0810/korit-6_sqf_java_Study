package com.study.java_study.ch09_클래스04.연습;

public class dircEntity {

    private int wordNumber;
    private String Eword;
    private String Kword;

    public dircEntity() {
    }

    public dircEntity(int wordNumber, String eword, String kword) {
        this.wordNumber = wordNumber;
        Eword = eword;
        Kword = kword;
    }

    public int getWordNumber() {
        return wordNumber;
    }

    public void setWordNumber(int wordNumber) {
        this.wordNumber = wordNumber;
    }

    public String getEword() {
        return Eword;
    }

    public void setEword(String eword) {
        Eword = eword;
    }

    public String getKword() {
        return Kword;
    }

    public void setKword(String kword) {
        Kword = kword;
    }

    @Override
    public String toString() {
        return "dircEntity{" +
                "wordNumber=" + wordNumber +
                ", Eword='" + Eword + '\'' +
                ", Kword='" + Kword + '\'' +
                '}';
    }
}
