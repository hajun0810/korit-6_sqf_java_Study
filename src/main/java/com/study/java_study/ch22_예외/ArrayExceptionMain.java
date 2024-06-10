package com.study.java_study.ch22_예외;

/*
    예외(오류)
    1. 컴파일 오류 -> 프로그램이 실행(메모리에 할당)되기 전에 오류
    2. 런타임 오류 -> 프로그램이 실행(메모리에 할당)된 후에 오류
 */
public class ArrayExceptionMain {

    public static void printArray(Integer[] nums, int length) throws Exception{ // 예외 미룸
            for(int i=0; i<length;i++){
                System.out.println("i: "+nums[i]);
            }

    }


    public static void main(String[] args)  {
        Integer[] nums = new Integer[] {1,2,3,4,5};

            try { // 미룬 예외 처리
                printArray(nums,6);
            }catch (Exception e){ // 미룰떄 Exception 으로 미뤘으니 Exception 으로 처리
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        System.out.println("프로그램 종료");

    }
}
