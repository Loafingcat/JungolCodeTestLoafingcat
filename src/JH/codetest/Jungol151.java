package JH.codetest;

import java.util.Scanner;

public class Jungol151 {
    public static void main(String[] args) {
        // 다섯개 정수 입력 받는다.
        // 두번째, 네번째 입력받은 정수의 합
        // 입력받은 모든 수의 합과 평균을 함께 보여주시오.
        Scanner sc = new Scanner(System.in);

        int input = 0;
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            input = sc.nextInt();
            arr[i] = input;
        }

        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println("두번째 네번째 합 = "+ (arr[1]+arr[3]) + "총합 = " + sum);
    }
}

