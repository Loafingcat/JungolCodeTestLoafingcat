package JH.codetest;

import java.util.Scanner;

public class Jungol140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[20];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i]==0)break;
        }
        int sum = sum(num);
        int avg = avg(num);

        System.out.println(sum + " " + avg);
    }
    private static int sum(int[] num) {
        int sum = 0;
        for (int number : num) {
            sum += number;
        }
        return sum;
    }
    private static int avg(int[] num) {
        int sum = 0;
        for (int number : num) {
            sum += number;
        }
        return sum / num.length;
    }
}
