package JH.codetest.arraypractice;

public class ArrayPractice {
    public static void main(String[] args) {

        int i[] = { 124, 634, 7, 5021525, 77, 8765, -356, 0 };

        // 최소값(Min) 출력
        System.out.println(min(i)); // -356

        // 최대값(Max) 출력
        System.out.println(max(i)); // 5021525

    }

    public static int max(int n[]) {
        int max = n[0];

        for (int i = 1; i < n.length; i++)
            if (n[i] > max) max = n[i];

        return max;
    }


    public static int min(int n[]) {
        int min = n[0];

        for (int i = 1; i < n.length; i++)
            if (n[i] < min) min = n[i];

        return min;
    }

}
