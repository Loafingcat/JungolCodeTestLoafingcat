package JH.codetest;

import java.util.Scanner;

public class Jungol207 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char op; //operater 연산자
        int num1;
        int num2;
        double result = 0;

        System.out.print("숫자 두 개를 입력하세요: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("+, -, *, /, % 중 하나를 고르세요.");
        op = sc.next().charAt(0);

        String strForPrint = calculate(op, num1, num2, result);
        printOut(op, strForPrint);
    }

    private static String calculate(char op, int num1, int num2, double result) {

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
        }
        return String.valueOf(result);
    }

    private static void printOut(char op, String str) {
        System.out.println("전체 숫자를" + op + "한 값은" + str + "로 나왔습니다.");
    }
}

