package com.study.java_study.ch14_Object;

import lombok.*;

@NoArgsConstructor  //기본생성자
@AllArgsConstructor //생성자
@Data //@Getter, @Setter, @EqualsAndHashCode, @ToString
public class Teacher {
    private String name;
    private int age;
}
