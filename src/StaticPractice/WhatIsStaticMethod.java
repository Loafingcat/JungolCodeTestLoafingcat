package StaticPractice;

class Name {
    static void print() {//클래스 메소드
        System.out.println("가나다라");
    }

    void print2() {//인스턴스 메소드
        System.out.println("라다나가");
    }
}

public class WhatIsStaticMethod {
    public static void main(String[] args) {
        Name.print();

        Name name = new Name();//인스턴스 생성
        name.print2();//인스턴스 생성해야 호출가능

        //Static 메소드는 클래스가 메모리에 올라갈 때 자동적으로 생성되니 인스턴스 생성 안해도 됨.
    }
}

