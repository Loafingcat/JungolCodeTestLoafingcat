package JH.codetest.Jungol159Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ScoreCalculator implements Exceptionable {
    private int LIMIT_NUMBER;
    Scanner sc = new Scanner(System.in);
    int score = 0;
    int num = sc.nextInt();

    public ScoreCalculator(int LIMIT_NUMBER) {
        this.LIMIT_NUMBER = LIMIT_NUMBER;
    }

    @Override
    public void examineLimitNumber() {
        if (num > LIMIT_NUMBER) {
            System.out.println("20이하의 정수만 입력하세요, 다시 입력하세요.");
            System.exit(0);
        }
    }

    @Override
    public Integer[] inputScore() {
        Integer[] arr = new Integer[num];
        System.out.print(num + "개의 성적을 입력하세요: ");
        for (int i = 0; i < num; i++) {
            score = sc.nextInt();
            arr[i] = score;
        }
        return arr;
    }

    @Override
    public void arraySort(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
    }

    @Override
    public void printArrayResult(Integer[] arr) {
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
