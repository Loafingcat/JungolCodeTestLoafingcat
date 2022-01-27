package JH.codetest;
import java.util.Scanner;

public class Jungol137 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("행의 개수 입력: ");
        int a = sc.nextInt();
        System.out.print("열의 개수 입력: ");
        int b = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
