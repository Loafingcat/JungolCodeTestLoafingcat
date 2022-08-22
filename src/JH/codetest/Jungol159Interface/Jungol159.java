package JH.codetest.Jungol159Interface;

public class Jungol159 {
    public static void main(String args[]) {
        System.out.println("성적을 내림차순으로 정리합니다.");
        System.out.print("성적의 갯수를 입력하세요: ");
        ScoreCalculator sc = new ScoreCalculator(20);

        sc.examineLimitNumber();
        Integer[] arr = sc.inputScore(); // 입력받고
        // 소팅해서
        sc.arraySort(arr);
        // 출력한다
        sc.printArrayResult(arr);
    }
}

