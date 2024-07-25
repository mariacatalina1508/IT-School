package session_16_collection_framework.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList  = initializeList();
    }

    public static boolean isElementPresent(List<Integer> list, int value) {
        // int value >= Integer value
        return list.contains(value);
    }

    public static List<Integer> updateList(List<Integer> list, int index, int value ) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index");
            return list;
        }

        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);
        return result;
    }

    public static List<Integer> initializeList() {
        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < 10; index++) {
            list.add(index);
        }

        return list;
    }
}