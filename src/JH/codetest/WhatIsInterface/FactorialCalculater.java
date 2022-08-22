package JH.codetest.WhatIsInterface;

import java.util.Scanner;

class FactorialCalculater implements Examinable {
    private int LIMIT_NUMBER;
    Scanner sc = new Scanner(System.in);
    int output = 1;
    int userInput = sc.nextInt();

    public FactorialCalculater(int LIMIT_NUMBER) {
        this.LIMIT_NUMBER = LIMIT_NUMBER;
    }

    @Override
    public void examinePrecondition() { // 이름이 익셉션 : 예외

        if ( userInput > LIMIT_NUMBER) {
            System.out.println(LIMIT_NUMBER + "이하의 숫자만 입력해주세요.");
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
