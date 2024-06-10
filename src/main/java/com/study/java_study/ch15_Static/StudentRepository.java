package com.study.java_study.ch15_Static;

public class StudentRepository {

    private static StudentRepository instance; // 자기자신의 객체를 하나 생성

    private String []names;

    //외부 생성 막음
    private StudentRepository(){
        names = new String[5];
    }

    //인스턴스 변수를 가져감
    public static StudentRepository getInstance(){
        if(instance == null){
            instance = new StudentRepository();
        }
        return instance;
    }

    public void add(String name){
        for(int i=0;i<names.length;i++){
            if(names[i] == null){
                names[i] = name;
                break;
            }
        }
    }

    public String [] getNames(){
        return names;
    }
}
