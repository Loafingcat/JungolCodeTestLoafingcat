package JH.codetest;

import java.util.*;

public class Arraytest2 {
    public static void main(String[] args) {

        // 정수
        List<Integer> i = Arrays.asList(111, -513, 0, 42424, 222, 333);

        System.out.println(Collections.min(i)); // -513
        System.out.println(Collections.max(i)); // 42424
        //콜렉션 배열을 사용할때는 Collections.max()/Collections.min()을 사용하면 손쉽게 최대값 최소값이 구해진다.
        //밑의 실수도 마찬가지다.
        //Arrays.asList는 Collection 기반 api의 다리 역할을 해준다고 함.



        // 실수
        List<Double> d = Arrays.asList(111.0, -513.0, 0.0, 42424.0, 222.0, 333.0);

        System.out.println(Collections.min(d)); // -513.0
        System.out.println(Collections.max(d)); // 42424.0




        // 문자 코드 순서를 비교
        String[] s = { "222", "BBB", "333", "111", "AAA" };

        System.out.println(Collections.min(Arrays.asList(s))); // 111
        System.out.println(Collections.max(Arrays.asList(s))); // BBB

    }
}
