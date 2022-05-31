package JH.codetest;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lottery lottery = new Lottery();

        System.out.println("자동 로또입니다");
        System.out.print("시행할 횟수를 입력하세요: ");

        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println(lottery.lotteryNumbers());
        }
    }

    String lotteryNumbers() {

        int[] lotteryNums = new int[6];

        for (int i = 0; i <= 5; i++) {
            lotteryNums[i] = (int) (Math.random() * 45) + 1;
            //중복제거
            for (int j = 0; j < i; j++) {
                if (lotteryNums[i] == lotteryNums[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(lotteryNums);

        return Arrays.toString(lotteryNums);
    }
}



