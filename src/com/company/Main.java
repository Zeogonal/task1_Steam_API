package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        List<Integer> newList = new ArrayList<>();
        for (int x : list) {
            if (x <= 0) continue;
            if (x % 2 != 0) continue;
            newList.add(x);
        }
        Collections.sort(newList);
        for (int i : newList) System.out.println(i);
    }
}