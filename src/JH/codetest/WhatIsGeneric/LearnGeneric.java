package JH.codetest.WhatIsGeneric;

import java.util.ArrayList;

public class LearnGeneric {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add("30");

        Integer i = (Integer)list.get(2);

        System.out.println(list);
        System.out.println(i);
    }
}
