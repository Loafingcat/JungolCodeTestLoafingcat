package JH.codetest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Jungol159 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("20이하의 정수를 입력하세요: ");

        int num, score = 0;
        num = sc.nextInt();
        if (num > 20) {
            System.out.println("20이하의 정수만 입력하세요, 다시 입력하세요.");
            System.exit(0);
        }
        Integer[] arr = new Integer[num];
        System.out.print(num + "개의 성적을 입력하세요: ");
        for (int i = 0; i < num; i++) {
            score = sc.nextInt();
            arr[i] = score;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i : arr) {
            System.out.println(i);
        }
    }
}