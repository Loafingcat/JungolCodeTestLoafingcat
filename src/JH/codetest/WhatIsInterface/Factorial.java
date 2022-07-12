package JH.codetest.WhatIsInterface;


public class Factorial {

    // 보완숙제 :
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // Caculator : 계산기, 뭘 계산하는지? 클래스 이름 불명확하다.

        // 매개변수가 들어가면 좋을듯 : 매개변수 역할은 n부터 factorial 연산 할건지?
        // caculate()는 사용자의 입력도 받고있고, 계산도 수행하고, console로 출력도 수행하다.
        // 각각 분리해서 구현 해보삼.
        calculator.calculate();
    }
}

