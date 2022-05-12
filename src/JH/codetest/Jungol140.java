package JH.codetest;

import java.util.ArrayList;
import java.util.Scanner;

public class Jungol140 {
    public static void main(String[] args) {
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

