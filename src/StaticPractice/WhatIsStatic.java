package StaticPractice;

class Number {
    static int num = 0; //클래스 필드
    int num2 = 0; //인스턴스 필드
}

public class WhatIsStatic {

    public static void main(String[] args) {
        Number number1 = new Number();//첫번째 number
        Number number2 = new Number();//두번째 number

        number1.num++;//클래스 필드 num을 1 증가시킴
        number1.num2++;//인스턴스 필드 num을 1 증가시킴
        System.out.println(number2.num);//두번째 number의 클래스 필드 출력
        System.out.println(number2.num2);//두번째 number의 인스턴스 필드 출력
        /*인스턴스 변수는 인스턴스가 생성될 때마다 생성되므로 인스턴스마다 각기 다른 값을 가지지만 Static 변수는
        모든 인스턴스가 하나의 저장공간을 공유하기에 항상 같은 값을 가지기에 나타난 현상.*/
    }
}
