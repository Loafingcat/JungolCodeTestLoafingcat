package JH.codetest;

import java.util.Arrays;
import java.util.Scanner;

public class Jungol154 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] weights = new double[5];

        for (int i = 0; i < weights.length; i++) {
            weights[i] = sc.nextDouble();
            //Arrays.sort(weights);
        }
        double avg = avg(weights);
        double min = min(weights);
        double max = max(weights);

        // weights[] 배열의 길이에 상관 없이 평균을 구하는 메소드를 만들고, 이걸 갖다 써서 구현 해 보시오.
        System.out.print("몸무게 평균 : ");
        System.out.printf("%.1f%n", avg);
        System.out.print("가장 가벼운 사람 : " + min + " " + "가장 무거운 사람 : " + max);
    }

    private static double min(double[] weights) {
        Arrays.sort(weights);
        return weights[0];
    }

    private static double max(double[] weights) {
        Arrays.sort(weights);
        return weights[weights.length - 1];
    }

    private static double avg(double[] weights) {
        double sum = 0;
        for (double number : weights) {
            sum += number;
        }
        return sum / weights.length;
    }
}