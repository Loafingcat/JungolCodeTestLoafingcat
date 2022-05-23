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
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userTypedNumbers = new ArrayList<>();
        final int MAX_INPUT_NUMBER_LENGTH = 5; // 최대로 입력 받을 수 있는 숫자의 갯수

        System.out.println("숫자를 입력하세요: ");

        // 유저로 하여금 숫자를 입력 받도록 한다.
        userTypingNumbers(scanner, userTypedNumbers, MAX_INPUT_NUMBER_LENGTH);

        int sum = sum(userTypedNumbers);
        int avg = avg(userTypedNumbers);

        System.out.println(sum + " " + avg);
    }

    // 유저가 MAX_INPUT_NUMBER_LENGTH 길이만큼 숫자들을 입력하는 만큼
    // numbers List에 담는다.
    private static void userTypingNumbers(Scanner sc, ArrayList<Integer> numbers, int MAX_INPUT_NUMBER_LENGTH) {
        int num;
        while ((num = sc.nextInt()) != 0) {
            numbers.add(num);
            if (numbers.size() == MAX_INPUT_NUMBER_LENGTH) {
                break;
            }
        }
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

