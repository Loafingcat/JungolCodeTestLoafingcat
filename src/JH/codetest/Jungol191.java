package JH.codetest;

import java.util.Scanner;

public class Jungol191 {
    public static void main(String[] args) {

        // YOU WIN
        Scanner sc = new Scanner(System.in);
        String str[] = new String[50];
        String counts;
        int i,j;

        for(i = 0; i < 50; i++){
            counts = sc.next();
            if(counts.equals("0"))
                break;
            else if (counts.length() > 100) {
                System.out.print("100글자 미만의 단어만 입력하세요.");
                System.exit(0);
            }
            str[i] = counts;
        }
        System.out.println("입력된 단어의 개수 : " + i);

        for(j = 1; j <= i; j++){
            if(j % 2 == 1)
                System.out.println(str[j - 1]);
        }
    }
}
