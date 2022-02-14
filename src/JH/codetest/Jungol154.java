package JH.codetest;

import java.util.Scanner;

public class Jungol154 {
    public static void main(String[] args){
        // 5명의 몸무게를 입력 받아
        // 전체 평균
        // 가장 낮은 몸무게와
        // 가장 높은 몸무게를 출력 하시오

        Scanner sc = new Scanner(System.in);

        double[] weight = new double[6];
        double avg = 0;

        for(int i = 0; i < 6; i++){
            weight[i] = sc.nextDouble();
            avg += weight[i];
        }
        avg /= 6;
        System.out.printf("%.1f", avg); // 소수 첫째자리에서 반올림 되는가? 안되면 어떻게 구현 고쳐야 할까?
    }
}
