package JH.codetest.collectionpractice;


import java.util.ArrayList;
import java.util.Scanner;

public class CollectionPractice2 {
    public static void main(String[] args) {
        // collection 연습문제
        // 숫자를 입력받고, 0을 입력받으면 입력 그만 받고
        // 입력받은 숫자를 모두 출력하시오.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("숫자를 입력하세요: ");
        int num = sc.nextInt();
        while (num != 0) {
            numbers.add(num);
            num = sc.nextInt();
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
