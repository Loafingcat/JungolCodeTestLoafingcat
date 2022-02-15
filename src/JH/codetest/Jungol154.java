package JH.codetest;

import java.util.Arrays;
import java.util.Scanner;

public class Jungol154 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double[] weight = new double[5];
        Arrays.sort(weight);
        double avg = 0;

        for (int i = 0; i < 5; i++) {
            weight[i] = sc.nextDouble();
            // weight[] 배열의 길이에 상관 없이 평균을 구하는 메소드를 만들고, 이걸 갖다 써서 구현 해 보시오.
            avg += weight[i];
        }

        avg /= 5;

        System.out.printf("%.1f%n", avg);// %.소수점자리수f 가 반올림한 결과를 보여준다. String.Format을 이용한 방법
        // printf()를 줄바꿈 하고 싶으면 큰따옴표 안에 \n이나 %n을 넣으면
        System.out.print("가장 가벼운 사람 :"+weight[0]+" "+"가장 무거운 사람 : "+weight[weight.length-1]);
    }
}