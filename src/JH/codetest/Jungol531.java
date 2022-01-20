package JH.codetest;

import java.util.Scanner;

public class Jungol531 {
    public static void main(String[] args) {
        double w;
        Scanner sc = new Scanner(System.in);
        w = sc.nextDouble();
        if (isweight(w, 50.8, 61.23, 72.57, 88.45)) {
            System.out.println("Flyweight");
        } else {
            System.out.println("Heavyweight");
        }
    }

    private static boolean isweight(double w, double... inputs) {
        for (double i : inputs) {
            if (w <= i) {
                return true;
            }
        }
        return false;
    }
}

       
