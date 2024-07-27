package session_16_collection_framework.challenge.array_list;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

import static session_16_collection_framework.challenge.linked_list.Challenge_1.displayList;
import static session_16_collection_framework.practice.ListPractice.updateList;

public class Challenge_5 {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(5);
        array.add(10);
        array.add(45);
        array.add(70);

        System.out.println("The original list is: ");
        displayList(array);

        updateList(array, 1, 5);

        System.out.println("The update list is: ");
        displayList(array);
    }

    public static void displayList(List<Integer> myList) {
        for(int element : myList) {
            System.out.println(element + " ");
        }

        System.out.println();
    }

    public static void updateList(List<Integer> myList, int index, int value) {
        myList.set(index, value);
    }
}
