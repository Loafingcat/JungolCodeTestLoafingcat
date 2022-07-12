package JH.codetest.WhatIsInterface;

import java.util.Scanner;

public class Calculator implements CalculateFactorial {

    @Override
    public void calculate() { // 계산하다 : 뭘 계산하는건지 불명확, 메소드 이름 변경
        // 사용자의 입력을 받음
        Scanner sc = new Scanner(System.in);
        System.out.println("팩토리얼 계산기입니다.");
        System.out.print("10 이하의 숫자를 입력해주세요: ");

        int n = sc.nextInt();

        // 사용자 입력의 예외 처리
        if(n > 10){
            System.out.println("10이하의 숫자만 입력해주세요.");
            System.exit(0);
        }

        // factorial 연산
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }

        // 출력
        System.out.println(a);
    }
}
