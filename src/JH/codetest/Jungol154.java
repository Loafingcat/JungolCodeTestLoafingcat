package JH.codetest;

import java.util.Scanner;

public class Jungol154 {
    public static void main(String[] args) {
        // 5명의 몸무게를 입력 받아
        // 전체 평균
        // 가장 낮은 몸무게와
        // 가장 높은 몸무게를 출력 하시오
        Scanner sc = new Scanner(System.in);
        double[] weight = new double[5];
        double max = weight[0];
        double min = weight[0];
        double avg = 0;

        for (int i = 0; i < 5; i++) {
            weight[i] = sc.nextDouble();
            avg += weight[i];
        }
        avg /= 5;
        System.out.printf("%.1f%n", avg);// %.소수점자리수f 가 반올림한 결과를 보여준다. String.Format을 이용한 방법
        // printf()를 줄바꿈 하고 싶으면 큰따옴표 안에 \n이나 %n을 넣으면 된다.

        for (double v : weight) {
            if (min > v) {
                min = v;
            }
            if (max < v) {
                max = v;
            }
        }
        System.out.println("가장 가벼운 사람 :"+min+", 가장 무거운 사람 :"+max);
    }
}
