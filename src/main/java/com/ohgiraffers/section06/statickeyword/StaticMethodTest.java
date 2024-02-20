package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;
    public void nonStaticMethod(){

        this.count++;
        System.out.println("nonStaticMethod 호출됨 ... " );

    }

    public static void staticMethod(){ // 스태틱은 주소가 없다.
//        인스턴스를 생성하지 않고 사용하는 메소드 이기 때문에 this 에는 주소가 들어갈 수 없다
//        this.count++;
        System.out.println(" staticMethod 호출됨... ");

    }
}
