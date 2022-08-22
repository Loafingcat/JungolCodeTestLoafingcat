package JH.codetest.WhatIsGeneric;

class PracticeGeneric <T> {
    T t;
    public PracticeGeneric(T t) {
        this.t = t;
    }
    void setT(T t) {
        this.t = t;
    }
    T getT() {
        return t;
    }
}
public class GenericSample2 {
    public static void main(String[] args) {
        PracticeGeneric<Integer> ge1 = new PracticeGeneric<>(100);//int형으로 인자 전달
        PracticeGeneric<String> ge2 = new PracticeGeneric<>("apple");//String형
        PracticeGeneric<Object> ge3 = new PracticeGeneric<>("banana");//Object형

        System.out.println(ge1.getT());
        System.out.println(ge2.getT());
        System.out.println(ge3.getT());
    }
}
