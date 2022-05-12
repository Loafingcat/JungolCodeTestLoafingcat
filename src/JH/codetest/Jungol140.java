package JH.codetest;

import java.util.ArrayList;
import java.util.Scanner;

public class Jungol140 {
    public static void main(String[] args) {
        // 20개 이하의 숫자를 입력받는다.
        // <=20 개 이하로 받다가 0 입력받으면 '계산' 수행.
        // 20개 까지 모두 입력 받으면 '계산' 수행한다.
        // 20개까지 입력 받으면, 즉각 '계산'을 수행하도록.

        // '계산' : 합계, 평균을 출력한다.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("숫자를 입력하세요: ");

        int num = sc.nextInt();

        while (num != 0) {
            numbers.add(num);
            num = sc.nextInt();
        }
        if (numbers.size() > 20) {
            System.out.println("20개 이하의 숫자만 입력하세요.");
            System.exit(0);
        }
        int sum = sum(numbers);
        int avg = avg(numbers);

        System.out.println(sum + " " + avg);
    }
    private static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
    private static int avg(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum / numbers.size();
    }
}

