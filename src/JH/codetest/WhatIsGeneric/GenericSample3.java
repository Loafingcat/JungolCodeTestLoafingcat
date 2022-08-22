package JH.codetest.WhatIsGeneric;

class PracticeGeneric2 <A, B> {
    A a;
    B b;

    void print(A a, B b) {
        System.out.println("a= " + a + ", b= " + b );
    }
}

public class GenericSample3 {
    public static void main(String[] args) {
        PracticeGeneric2<String, Integer> ge1 = new PracticeGeneric2<>();
        PracticeGeneric2<Integer, String> ge2 = new PracticeGeneric2<>();

        ge1.print("a", 1);
        ge2.print(200, "b");
    }
}
