package JH.codetest;

import java.util.Scanner;
public class Jungol123 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("What number: ");
        num = sc.nextInt();
        //1. 개
        //2. 고양이
        //3. 병아리
        //해당 없으면 "I don't know."
        switch (num) {
            case 1:
                System.out.println("dog");
                break;
            case 2:
                System.out.println("cat");
                break;
            case 3:
                System.out.println("chick");
                break;
            default:
                System.out.println("I don't know.");
                break;
        }
    }
}