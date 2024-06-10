package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringArrayListMain {
    public static void main(String[] args) {
        //배열 생성
        String [] strArray = new String [10];

        //배열에 값 넣기
        strArray[0] = "test1";

        //ArrayList 생성
        List<String> strList = new ArrayList<>();
        //List에 값 넣기
        strList.add("test1");

        //배열을 list로 생성
        List<String> list =new ArrayList<>(Arrays.asList(strArray));
        List<String> list2 = new ArrayList();
        list.addAll(list);

        String[] strArray2 = strList.toArray(new String[strList.size()]);

        //리스트 값 조회
        System.out.println(strList);

        //contains 포함 조회
        System.out.println(strList.contains("test"));

        //리스트 바로 생성
        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(nums);

        //값 제거
        strList.add("학생1");
        strList.add("학생2");
        strList.add("학생3");
        System.out.println(strList.remove("test1")); //값으로 지우기
        System.out.println(strList);
        System.out.println(strList.remove(1)); //index번호로 지우기
        System.out.println(strList);

        System.out.println(nums);
        // list.of는 데이터 수정이 불가능
        System.out.println(nums.removeAll(List.of(1,3,5))); //ArrayList 에서만 가능 List 에서는 X
        System.out.println(nums);

        //수정
        nums.set(0,10); //0번 인덱스의 값을 10으로 바꿔라
        System.out.println(nums);

        nums.addAll(List.of(1,2,3)); // 값을 뒤로 넣는다
        System.out.println(nums);

        //반복
        for(int i=0;i<nums.size();i++){ //일반 for
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();

        for(Integer num : nums){ // for each
            System.out.print(num+" ");
        }

        System.out.println();
        Iterator<Integer> ir = nums.iterator();
        while(ir.hasNext()){ // 다음이 있으면 반복
            System.out.print(ir.next()+" ");
        }


    }
}
