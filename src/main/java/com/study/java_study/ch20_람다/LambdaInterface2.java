package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {

        Runnable runnable = () -> {
                System.out.println("프로그램 실행");
        };
        runnable.run();

        Function<String, Integer> y = s -> Integer.parseInt(s);

        Integer n1 = y.apply("100");
        System.out.println(n1);

        Consumer<String> con = (String s) -> {
                System.out.println(s+"님 환영합니다.");
        };
        con.accept("손");

        Predicate<Integer> event = integer -> integer % 2 == 0;
        System.out.println(event.test(10));

        Supplier<Integer> role = ()-> {
                return 999;
        };
        System.out.println(role.get());

    }
}
