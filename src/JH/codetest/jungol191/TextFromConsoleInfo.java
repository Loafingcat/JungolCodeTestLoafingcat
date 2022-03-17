package JH.codetest.jungol191;

public class TextFromConsoleInfo {
    String[] texts; // 입력받은 단어 모음.

    //분류된 texts를 getTexts() 값으로 지정
    public String[] getTexts() { //객체의 기능
        return texts;
    }

    //text가 null이 아니거나 exceptStr과 같지 않은 texts를 count++
    public int getTextsCount(String exceptStr){
        int count = 0;
        if(texts != null){
            for (String t : texts) {
                if (t != null && !t.equals(exceptStr)) {
                    count++;
                }
            }
        }
        return count;
    }
    //texts는 count_limit_input_text 까지
    public void setTexts(int count_limit_input_text) {
        texts = new String[count_limit_input_text];
    }
}
