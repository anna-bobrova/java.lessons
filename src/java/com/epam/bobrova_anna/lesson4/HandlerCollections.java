package com.epam.bobrova_anna.lesson4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HandlerCollections {

    public static int findMinElem(List<Integer> list) {
        int minElem = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minElem) {
                minElem = list.get(i);
            }
        }
        return minElem;
    }

    public static boolean listHasUniqueValues(List<Integer> list) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (!hashSet.add(list.get(i))) {
                System.out.println("Список содержит неуникальный элемент");
                return false;
            } else hashSet.add(list.get(i));
        }
        return true;
    }

}

