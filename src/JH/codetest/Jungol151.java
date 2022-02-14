package JH.codetest;

import java.util.Scanner;

public class Jungol151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[0] + arr[2] + arr[4]);
    }
}
