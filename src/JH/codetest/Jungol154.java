package JH.codetest;

import java.util.Scanner;

public class Jungol154 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] weight = new double[6];
        double avg = 0;

        for(int i = 0; i < 6; i++){
            weight[i] = sc.nextDouble();
            avg += weight[i];
        }
        avg /= 6;
        System.out.printf("%.1f", avg);
    }
}
