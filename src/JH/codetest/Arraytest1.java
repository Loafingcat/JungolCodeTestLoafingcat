package JH.codetest;

public class Arraytest1 {
    public static void main(String[] args) {

        int i[] = { 124, 634, 7, 5021525, 77, 8765, -356, 0 };

        // 최소값(Min) 출력
        System.out.println(min(i)); // -356

        // 최대값(Max) 출력
        System.out.println(max(i)); // 5021525

    }

    public static int max(int n[]) {
        int max = n[0];//첫번째 자리부터 계속 비교비교

        for (int i = 1; i < n.length; i++)
            if (n[i] > max) max = n[i];
        //배열의 수를 비교하여 가장 큰 수가 max가 되게 한다.

        return max;
    }


    public static int min(int n[]) {
        int min = n[0];

        for (int i = 1; i < n.length; i++)
            if (n[i] < min) min = n[i];
        //배열의 수를 n[i]가 min보다 작은 경우를 for문으로 계속 반복 비교하여 가장 작은 수가 min이 되도록 한다.

        return min;
    }

}
