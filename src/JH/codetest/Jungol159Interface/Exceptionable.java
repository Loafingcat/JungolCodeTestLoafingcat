package JH.codetest.Jungol159Interface;

public interface Exceptionable extends InputableScore, ArraySortable, ArrayResultPrintable {

    void examineLimitNumber();

    @Override
    Integer[] inputScore();

    @Override
    void arraySort(Integer[] arr);

    void printArrayResult(Integer[] arr);
}
