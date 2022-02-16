package JH.codetest;

import java.util.Arrays;
import java.util.Scanner;

public class Jungol154 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] weight = new double[5];
        Arrays.sort(weight);

        for (int i = 0; i < weight.length; i++) {
            weight[i] = sc.nextDouble();
        }
        double avg = avg(weight);
        // weight[] 배열의 길이에 상관 없이 평균을 구하는 메소드를 만들고, 이걸 갖다 써서 구현 해 보시오.
        System.out.printf("%.1f%n", avg);
        System.out.print("가장 가벼운 사람 :" + weight[0] + " " + "가장 무거운 사람 : " + weight[weight.length - 1]);
        }

    private static double avg(double[] weight) {
        double sum = 0;
        for (double number : weight) {
            sum = sum + number;
        }
        return sum/weight.length;
    }
}