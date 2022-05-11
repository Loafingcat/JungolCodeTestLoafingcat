package JH.codetest.collectionpractice;

import java.util.ArrayList;

public class CollectionPractice {

    public static void main(String[] args) {

        // 배열 기능의 한계.
        int[] nums = new int[20]; // 배열 길이를 처음 선언할때 부터 정해야 한다.
                                  // jungol140문제때 처럼 '입력받는 데이터의 양에 따라 길이가 정해지는 배열'이 있으면 더 편하겠지?

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        // nums 배열의 길이
        System.out.println("nums 배열의 길이=" + nums.length);

        // List (여러 종류의 자료 구조-List, Map, Set, ....-를 담은 JDK 패키지-도구- )
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        //numbers.add(2);
        numbers.add(3);

        // numbers 배열의 길이
        System.out.println("numbers 배열의 길이=" + numbers.size());

        for (int n : numbers) {
            System.out.println(n);
        }



    }
}
