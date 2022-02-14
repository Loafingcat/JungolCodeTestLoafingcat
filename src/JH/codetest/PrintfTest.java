package JH.codetest;

import java.util.Arrays;

public class PrintfTest {
    public static void main(String[] args) {
//        System.out.printf("%.1f\n", 22.25);

        double[] numbers = {22.2, 11.1, 55.5, 55.444,33.22, 55.78, 666.443, 33.3, 44.4};
        Arrays.sort(numbers);


        for(double d : numbers){
            System.out.println(d);
        }

        // 최소값
        System.out.println(numbers[0]);
        // 최대값 (배열의 가장 끝 index값을 보여 주면 됨)
        System.out.println(numbers[numbers.length-1]);

    }
}
