package JH.codetest.jungol191;

public class TextFromConsoleInfo {
    String[] texts; // 입력받은 단어 모음.

    //
    public String[] getTexts() {
        return texts;
    }

    /*
    *
    * */
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

    public void setTexts(int count_limit_input_text) {
        texts = new String[count_limit_input_text];
    }
}
