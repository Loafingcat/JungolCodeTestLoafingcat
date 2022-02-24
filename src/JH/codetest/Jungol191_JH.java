package JH.codetest;

import java.util.Scanner;

public class Jungol191_JH {
    // 1. 단어를 입력받다가 "0"을 입력받으면 입력을 종료
    // 2. 하고, 그 때까지 입력받은 단어의 개수를 출력
    // 3. 단어의 개수는 50개를 넘지 않고, 단어의 길이는 100자 이하이다.
    // 4. 하고, 홀수 번째 입력받은 단어를 한 줄에 1개씩 출력
    // 하는 프로그램을 작성하시오.
    // ====입력 예====
    // keyboard
    // mouse
    // monitor
    // 0
    // ====출력 예====
    // 3
    // keyboard
    // monitor
    public static void main(String[] args) {
        // 1. 단어를 입력받다가 "0"을 입력받으면 입력을 종료
        Scanner sc = new Scanner(System.in); // 인스턴스?
        System.out.println("단어를 입력 하시오.");

        int count = getTextCountUntilInputIs(sc, "0", 50, 100);
        // 2. 하고, 그 때까지 입력받은 단어의 개수를 출력
        printInputedTextCount(count);
    }

    private static void printInputedTextCount(int count) {
        System.out.println("입력받은 단어의 갯수 : " + count);
    }

    private static int getTextCountUntilInputIs(Scanner inputConsoleScanner, String is, int inputTextLimit, int inputTextLengthLimit) {
        int inputedTextCount = 0;
        while (true) {
            String inputedText = inputConsoleScanner.next();

            // 3. 단어의 개수는 50개를 넘지 않고,
            if(isInputedTextCountIsUnder(inputedTextCount, inputTextLimit)){
                break;
            }

            // 3. 단어의 길이는 100자 이하이다.
            if(isInputedTextLengthLimit(inputedText, inputTextLengthLimit)){
                break;
            }

            if(isInputTextMatch(inputedText, is)){
                break;
            }
            inputedTextCount++;
        }
        return inputedTextCount;
    }

    private static boolean isInputedTextLengthLimit(String inputedText, int inputTextLengthLimit) {
        return inputedText.length() <= inputTextLengthLimit;
    }

    private static boolean isInputedTextCountIsUnder(int inputedTextCount, int inputTextLimit) {
        return inputedTextCount <= inputTextLimit;
    }

    private static boolean isInputTextMatch(String input, String is) {
        return input.equals(is);
    }

}
