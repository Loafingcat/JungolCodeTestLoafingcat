package JH.codetest;

import java.util.Scanner;

public class Jungol531 {
    public static void main(String[] args) {
        double kg;
        Scanner sc = new Scanner(System.in);
        kg = sc.nextDouble();
        //50.80 Flyweight
        //61.23 Lightweight
        //72.57 Middleweight
        //88.45 Cruiserweight
        //초과 Heavyweight

        if (isweight(kg, 50.80)) {
            System.out.println("Flyweight");
        } else if(isweight(kg, 61.23)){
            System.out.println("Lightweight");
        } else if(isweight(kg, 72.57)){
            System.out.println("Middleweight");
        } else if(isweight(kg, 88.45)) {
            System.out.println("Cruiserweight");
        } else {
            System.out.println("Heavyweight");
        }
    }
    private static boolean isweight(double kg, double compare){
        if(kg <= compare);
        return true;
    }
}



       
