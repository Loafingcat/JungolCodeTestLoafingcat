package JH.codetest;

import java.util.Scanner;

public class Jungol528 {
    public static void main(String[] args){
        // 정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
        // http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=165&sca=1050

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        // 값, 객체, 배열 의 TYPE이 있다.
        // 타입? : int, byte, short, long, boolean, char, float, double, String(문자열) (기본형 : java세계에서 값 그 자체를 표현하는 원자단위)

        // 입력 받은 수를 출력
        printConsole(input);
        // '음수' 이면 minus라고 출력.
        if(isMinus(input)){
            printConsole("minus");
        }
        //
        //
        // 준호 너무 열심히 하지 말고 적당히 빡시게 잘 따라 오니라.
        // 홓로로로로롤ㄹ로호홀로ㅗㄹ호ㅗㄹ로롤
        //
    }

    private static void printConsole(String inputStr) {
        System.out.println(inputStr);
    }
    private static void printConsole(int input){
        System.out.println(input);
    }

    // 음수 인지 아닌지를 검사해서 true OR false를 리턴함.
    private static boolean isMinus(int input) {
        return input < 0;
    }
}