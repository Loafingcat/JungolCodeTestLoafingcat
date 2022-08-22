package JH.codetest.WhatIsInterface;

// 자바 인터페이스를 사용해본다에 의의를 두는 팩토리얼 계산 연습.
public class Factorial {

    // 보완숙제 :
    public static void main(String[] args) {
        // Caculator : 계산기, 뭘 계산하는지? 클래스 이름 불명
        System.out.println("팩토리얼 계산기입니다.");
        System.out.print("숫자를 입력하세요: ");

        Examinable fc = new FactorialCalculater(4);


        fc.examinePrecondition(); // 검사 : 사용자가 입력하는 숫자가 ? 이상인가 아닌가?
        fc.calculateFactorial();
        fc.printOut();

    }
}

