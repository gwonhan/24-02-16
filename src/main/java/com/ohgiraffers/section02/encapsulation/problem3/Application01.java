package com.ohgiraffers.section02.encapsulation.problem3;

public class Application01 {
    public static void main(String[] args) {

        /*수업목표. 플드에 직접 접근시 발생하는 문제를 해결하는 방법(3)*/

        Monster monster1 = new Monster();
        monster1.setName("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setName("드라큘라");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setName("드라큘라");
        monster3.setHp(-300);


//        System.out.println("monster1 = " + monster1.name);
//        System.out.println("monster3 = " + monster1.hp);


        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());

        monster3.kinds ="두치";       // 아직도 필드에 접근하고 있다 ->
        monster3.hp =100;            // 현재 필드에 접근 못하게 하고 있지만 현재까지는 접근할 수 있다.(값이 추가가된다)

        System.out.println("monster3 = " + monster3.kinds);
        System.out.println("monster3 = " + monster3.hp);

    }
}
