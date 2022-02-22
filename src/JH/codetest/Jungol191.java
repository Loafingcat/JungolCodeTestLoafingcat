package JH.codetest;

import java.util.Scanner;

public class Jungol191 {
    public static void main(String[] args) {
        //50개를 넘지 않고 길이가 100이하인 단어를 입력받기
        //0을 입력 받으면 입력을 종료하고 그 때까지 입력받은 단어 개수 출력
        //홀수 번째 입력받은 단어를 한줄에 1개씩 출력
        Scanner sc = new Scanner(System.in);
        String str[] = new String[50];
        String counts;
        int i,j;

        for(i = 0; i < 50; i++){
            counts = sc.next();
            if(counts.equals("0"))
                break;
            str[i] = counts;
        }
        System.out.println("입력된 단어의 개수 : " + i);

        for(j = 1; j <= i; j++){
            if(j % 2 == 1)
                System.out.println(str[j - 1]);
        }
    }
}
