package com.study.java_study.ch16_제네릭;

import lombok.ToString;

@ToString
public class Sender<T,T2,T3> {
    //받는 사람이 원하는 데이터 타입이 다른 경우 데이터 타입이 다른 같은 두 클래스를 만들어야 한다.
    //이를 해결하기 위해서 Object 자료형 사용 -> 사용하려면 다운캐스팅을 필수로 해야한다.
    //이 문제점도 해결하기 위해 <T>를 이용한 제네릭을 사용한다. -> 일반 자료형은 사용 불가 객체형으로만 사용가능[Wrapper 자료형]
    // [Wrapper 자료형] :  Integer --(언박싱)-> int , int --(박싱)-> Integer
    // Integer(int) , Boolean(boolean) , Character(char), Double(double) , Long(long) , Float(float)

    private T data1;
    private T2 data2;
    private T3 data3;

    public Sender(T data1, T2 data2, T3 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public T2 getData2() {
        return data2;
    }

    public void setData2(T2 data2) {
        this.data2 = data2;
    }

    public T3 getData3() {
        return data3;
    }

    public void setData3(T3 data3) {
        this.data3 = data3;
    }
}
