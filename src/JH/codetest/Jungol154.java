package JH.codetest;

import java.util.Arrays;
import java.util.Scanner;

public class Jungol154 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double[] weight = new double[5];
        double avg = 0;

        for (int i = 0; i < 5; i++) {
            weight[i] = sc.nextDouble();
            avg += weight[i];
        }

        avg /= 5;

        System.out.printf("%.1f%n", avg);// %.소수점자리수f 가 반올림한 결과를 보여준다. String.Format을 이용한 방법
        // printf()를 줄바꿈 하고 싶으면 큰따옴표 안에 \n이나 %n을 넣으면
        for(double d : weight){
            System.out.println(weight[0]);
            System.out.println(weight[weight.length-1]);
        }
    }
}