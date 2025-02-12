/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

package homework_37.Task1;

import java.util.ArrayList;
import java.util.List;

public class ListIntersection {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(List.of("apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "mango", "pear"));
        List<String> list2 = new ArrayList<>(List.of("banana", "cherry", "date", "fig", "grape", "orange", "plum", "peach", "melon"));
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("Общие элементы: " + findCommonElements(list1, list2));

    }

    public static List<String> findCommonElements(List<String> listA, List<String> listB) {
        List<String> commonElements = new ArrayList<>(listA);
        commonElements.retainAll(listB);
        return commonElements;

    }
}

