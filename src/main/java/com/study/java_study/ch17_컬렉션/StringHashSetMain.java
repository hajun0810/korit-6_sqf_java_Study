package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringHashSetMain {
    public static void main(String[] args) {

        HashSet<String> strSet = new HashSet<>();

        //추가
        strSet.add("김준일");
        strSet.add("김준이");
        strSet.add("김준삼");
        strSet.add("김준사");

        System.out.println(strSet);

        //Set은 인덱스가 없어 for-each 로만 반복이 가능하다.
        for(String name : strSet){
            System.out.println(Objects.hash(name));
        }

        //중복제거 list -> set -> list 중복이 제거된 리스트 생성
        strSet.addAll((List.of("김준일","김준이","김준이")));

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
        strList.sort(stringComparator); // 위의 코드를 람다식으로 사용하면 아래의 한줄로 줄일 수 있다.
        strList.sort(((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1,o2)));
        System.out.println(strList);

    }
}
