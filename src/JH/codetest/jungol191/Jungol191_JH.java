package JH.codetest.jungol191;

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

    private static int getTextCountUntilInputIs(Scanner consoleScanner, String is, final int COUNT_LIMIT_INPUT_TEXT, final int LENGTH_LIMIT_INPUT_TEXT) {
        int inputedTextCount = 0;
        String[] texts = new String[COUNT_LIMIT_INPUT_TEXT];
        while (true) {
            String textFromConsole = consoleScanner.next();
            texts[inputedTextCount] = textFromConsole;
            // 3. 단어의 개수는 50개를 넘지 않고,
            if(isTextCountLimitFromConsole(inputedTextCount, COUNT_LIMIT_INPUT_TEXT)){
                break;
            }

            // 3. 단어의 길이는 100자 이하이다.
            if(isTextLengthLimitFromConsole(textFromConsole, LENGTH_LIMIT_INPUT_TEXT)){
                break;
            }

            // 1. 단어를 입력받다가 0을 입력받으면 종료
            if(isTextMatch(textFromConsole, is)){
                break;
            }
            inputedTextCount++;
        }
        return inputedTextCount;
    }

    private static boolean isTextLengthLimitFromConsole(String inputedText, int inputTextLengthLimit) {
        return inputedText.length() <= inputTextLengthLimit;
    }

    private static boolean isTextCountLimitFromConsole(int inputedTextCount, int inputTextLimit) {
        return inputedTextCount <= inputTextLimit;
    }

    private static boolean isTextMatch(String input, String is) {
        return input.equals(is);
    }

}
