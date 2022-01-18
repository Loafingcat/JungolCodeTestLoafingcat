package JH.codetest;

import java.util.Scanner;
public class Jungol122 {

    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        if(x%400==0||(x%4==0&&x%100!=0))System.out.println("leap year");
        else System.out.println("common year");

    }

}
