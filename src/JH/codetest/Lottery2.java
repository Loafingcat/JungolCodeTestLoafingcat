package JH.codetest;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lottery[] = new int[6];
        System.out.println("자동 로또입니다");
        System.out.print("시행할 횟수를 입력하세요: ");

        int count = sc.nextInt();

        lotterynumbers(lottery, count);
    }

    private static void lotterynumbers(int[] lottery, int count) {
        for (int countStart = 1; countStart <= count; countStart++) {
            for (int i = 0; i < lottery.length; i++) {
                lottery[i] = (int) (Math.random() * 45) + 1;
                for (int j = 0; j < i; j++) {
                    if (lottery[i] == lottery[j]) {
                        i--;
                    }
                }
            }
            Arrays.sort(lottery);
            for (int i = 0; i < lottery.length - 1; i++) {
                System.out.printf("%5d", lottery[i]);
            }
            System.out.println();
        }
    }
}

