package JH.codetest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 0 이 입력될 때까지 정수를 계속 입력받아 4의 배수와, 6의 배수, 13의 배수, 24의 배수, 27의 배수, 30의 배수 를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        try {
            while(true){
                System.out.println("정수를 입력하세요");
                int inputNumber = sc.nextInt();
                System.out.println("input Number: " + inputNumber);
                if(inputNumber == 0){
                    break;
                }
                // list insert
                numberList.add(inputNumber);
            }

            int inputNumberCount = numberList.size();
            System.out.println("입력 받은 수들의 갯수 : " + inputNumberCount);
            System.out.print("입력받은 수들 : ");
            for(Integer a : numberList) {
                System.out.print(a + ", ");
                // a = 입력받은 수
                // inputs = 4의 배수와, 6의 배수, 13의 배수, 24의 배수, 27의 배수, 30의 배수
                if(isInputsMultipleBy(a, 4,6,13,24,27,30)) {
                    inputNumberCount--;
                }
            }
            System.out.println("");
            System.out.println("4의 배수와, 6의 배수, 13의 배수, 24의 배수, 27의 배수, 30의 배수 를 제외한 정수의 갯수 : " + inputNumberCount);
        } catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("정수를 넣으셔야 합니다. 다시 시도하세욧! ");
        }
        // printAllNumber(3,5,10);
    }

    private static boolean isInputsMultipleBy(int what, int... inputs) {
        for(int i : inputs){
            if(what % i == 0){
                return true;
            }
        }
        return false;
    }
}