package JH.codetest;

import java.util.Scanner;

public class Jungol166 {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        int[][] arr3 = new int[2][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("first array");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("second array");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];

                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
