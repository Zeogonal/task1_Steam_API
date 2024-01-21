package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> intListFiltered1 = new ArrayList<>();
        List<Integer> intListFiltered2 = new ArrayList<>();

        for (int x :
                intList) {
            if (x > 0) {
                intListFiltered1.add(x);
            }
        }

        for (int x :
                intListFiltered1) {
            if (x % 2 == 0) {
                intListFiltered2.add(x);
            }
        }

        intListFiltered2.sort((a, b) -> a.compareTo(b));

        for (int i:
                intListFiltered2) {
            System.out.println(i);
        }
    }
}