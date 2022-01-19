package JH.codetest;

import java.util.Scanner;
public class Jungol122 {

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (isLeapYear(x)) {
            System.out.println("leap year");
        } else {
            System.out.println("common year");

        }
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        
    }

}
