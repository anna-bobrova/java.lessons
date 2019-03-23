package com.epam.bobrova_anna.lesson4;

import java.util.*;

public class DemoCollections {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        //добавление элемента для создания неуникальной последовательности
        list.add(1);

        Collections.shuffle(list);
        System.out.println("Список элементов: " + list.toString());

        if (HandlerCollections.listHasUniqueValues(list)) {
            System.out.println("Список содержит уникальные значения" + list.toString());
        }

        //Минимальный элемент последовательности
        System.out.println("Минимальный элемент последовательности: " + HandlerCollections.findMinElem(list));

        System.out.println("Количество элементов в списке: " + list.size());

        //Удалите все нечетные элементы из последовательности
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        System.out.println("Список после удаления нечетных элементов" + list.toString());

        //Найдите предпоследний по величине элемент
        Collections.sort(list);
        System.out.println("Предпоследний по величине элемент: " + list.get(list.size() - 2));
    }

}
