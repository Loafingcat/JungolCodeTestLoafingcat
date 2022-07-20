package JH.codetest.WhatIsInterface;

import java.util.Scanner;

class FactorialCalculater implements Examinable {
    Scanner sc = new Scanner(System.in);
    int output = 1; // 멤버변수 이름을 에이?
    int userInput = sc.nextInt(); // 멤버변수 이름이 엔?

    @Override
    public void examinePrecondition() { // 이름이 익셉션 : 예외

        if ( userInput > 10) {
            System.out.println("10이하의 숫자만 입력해주세요.");
            System.exit(0);
        }
    }

    @Override
    public void calculateFactorial() {

        for (int i = 1; i <= userInput; i++) {
            output = output * i;
        }
    }

    @Override
    public void printOut() {
        System.out.println(output);
    }

    public void getDummy(){
        System.out.println("dummy");
    }


}
