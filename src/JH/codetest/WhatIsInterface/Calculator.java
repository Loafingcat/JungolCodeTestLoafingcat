package JH.codetest.WhatIsInterface;

import java.util.Scanner;

public class Calculator implements CalculateFactorial {

    @Override
    public void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("팩토리얼 계산기입니다.");
        System.out.print("10 이하의 숫자를 입력해주세요: ");

        int n = sc.nextInt();

        if(n > 10){
            System.out.println("10이하의 숫자만 입력해주세요.");
            System.exit(0);
        }

        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        System.out.println(a);
    }
}
