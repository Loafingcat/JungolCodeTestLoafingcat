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
    // COUNT_LIMIT_INPUT_TEXT 3일 때 홀수 부분의 단어가 제대로 출력이 안됨
        final String TURN_OFF_STRING = "0";
        TextFromConsoleInfo info = getTextCountUntilInputIs(sc, TURN_OFF_STRING, 6, 10);
        // 2. 하고, 그 때까지 입력받은 단어의 개수를 출력
        printInputedTextCount(info.getTextsCount(TURN_OFF_STRING));
        // 4. 하고, 홀수 번째 입력받은 단어를 한 줄에 1개씩 출력
        printTexts(info.getTexts(), "odd");
    }
    //홀수 번째 입력받은 단어 골라내기
    private static void printTexts(String[] texts, String odd) {
        for(int i = 0; i < texts.length; i++){
            if(odd.equals("odd") & isOddIdxNum(i)){
                if(texts[i] != null) {
                    System.out.println(texts[i]);
                }
            }
        }
    }

    // i가 홀수인지 짝수인지?
    private static boolean isOddIdxNum(int i) {
        return (i + 1) % 2 == 1; // 홀수}
    }

    // count를 console에 출력
    private static void printInputedTextCount(int count) {
        System.out.println("입력받은 단어의 갯수 : " + count);
    }

    /* COUNT_LIMIT_INPUT_TEXT은 단어 갯수 제한
    * LENGTH_LIMIT_INPUT_TEXT은 단어 길이 제한
    * tfci는 TextFromConsoleInfo에서 분류된 texts
    * inputedTextCount는 세어진 단어의 개수
    * tfci는 COUNT_LIMIT_INPUT_TEXT까지
    * TextFromConsoleInfo에서 돌고 나온 texts가 count++됨
    */
    private static TextFromConsoleInfo getTextCountUntilInputIs(Scanner consoleScanner, String is, final int COUNT_LIMIT_INPUT_TEXT, final int LENGTH_LIMIT_INPUT_TEXT) {
        TextFromConsoleInfo tfci = new TextFromConsoleInfo();
        int inputedTextCount = 0;
        tfci.setTexts(COUNT_LIMIT_INPUT_TEXT);
        while (true) {
            String textFromConsole = consoleScanner.next();
            tfci.getTexts()[inputedTextCount] = textFromConsole;
            inputedTextCount++;

            // 1. 단어를 입력받다가 0을 입력받으면 종료
            if(isTextMatch(textFromConsole, is)){
                break;
            }

            // 3. 단어의 개수는 COUNT_LIMIT_INPUT_TEXT개를 넘지 않고,
            if(isTextCountLimitFromConsole(inputedTextCount, COUNT_LIMIT_INPUT_TEXT)){
                break;
            }

            // 3. 단어의 길이는 100자 이하이다.
            if(isTextLengthLimitFromConsole(textFromConsole, LENGTH_LIMIT_INPUT_TEXT)){
                break;
            }

        }
        return tfci;
    }

    private static boolean isTextLengthLimitFromConsole(String inputedText, int inputTextLengthLimit) {
        return inputedText.length() >= inputTextLengthLimit;
    }

    private static boolean isTextCountLimitFromConsole(int inputedTextCount, int inputTextLimit) {
        return inputedTextCount >= inputTextLimit;
    }

    private static boolean isTextMatch(String input, String is) {
        return input.equals(is);
    }

}
