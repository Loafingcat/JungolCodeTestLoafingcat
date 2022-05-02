package JH.codetest;

import java.util.Scanner;

public class Jungol207 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char op; //operater 연산자
        int num1;
        int num2;
        double result;

        System.out.print("숫자 두 개를 입력하세요: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("+, -, *, /, % 중 하나를 고르세요.");
        op = sc.next().charAt(0);

        switch(op) {
            case '+':
                result = num1 + num2;
                System.out.println("두 수를" + op + "한 값은" + result + "입니다.");
                break;
            case '-':
                result = num1 - num2;
                System.out.println("두 수를" + op + "한 값은" + result + "입니다.");
                break;
            case '*':
                result = num1 * num2;
                System.out.println("두 수를" + op + "한 값은" + result + "입니다.");
                break;
            case '/':
                result = num1 / num2;
                System.out.println("두 수를" + op + "한 값은" + result + "입니다.");
                break;
            case '%':
                result = num1 % num2;
                System.out.println("두 수를" + op + "한 값은" + result + "입니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
        }
    }
}
