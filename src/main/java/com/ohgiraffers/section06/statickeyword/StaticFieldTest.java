package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    /*static 필드, non static 필드 선언*/

    private int nonStatiCount;

    private static int StatiCount;

    public StaticFieldTest(){}


    public int getNonStatiCount() {return this.nonStatiCount;}

    public int getStatiCount(){

        /*필기.
        *  static 필드에 접근하기 위해서는 클래스명. 필드명 으로 접근한다.
        *  this. 으로 접근이 가능은 하지만, this 를 사용한지 않는 것이 좋다.
        *  */

        return StaticFieldTest.StatiCount;
    }
    /*두 개의 필드 값을 1씩 증가시키기 위한 메소드*/

    public void  increaseNonStaticCount() {this.nonStatiCount++;}

    public void increaseStaticCount() {StaticFieldTest.StatiCount++;}


}
