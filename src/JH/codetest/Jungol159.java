package JH.codetest;
import java.util.Scanner;

public class Jungol159 {
    //20 이하의 정수 n을 입력받고 n명의 점수를 il.Scanner;
    //입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("20이하의 정수 입력: ");
        //변수 머머머 필요하냐
        //20이하의 정수 n은 20짜리 배열 선언 해주고
        //입력받은 정수의 개수가 점수 배열의 개수
        //그리고 내림차순으로 정리
        //20이하의 정수 n을 입력받아 출력
        int[] arr = new int[20];
        int num = 0;
        int score = 0;
        int temp = 0;

        num = sc.nextInt();
        if (num > 20) {
            System.out.println("20이하의 정수만 입력하세요");
        }
        System.out.print(num + "개의 성적을 입력하세요: ");
        for (int i = 0; i < num; i++) {
            score = sc.nextInt();
            arr[i] = score;
        }
        //높은 점수부터 차례로 출력
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
}