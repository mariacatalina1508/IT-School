package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.List;

public class Challenge_9 {

    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Pineapple");

        System.out.println("Original LinkedList: " + list);

        List<String> elementsToInsert = List.of("Elderberry", "Fig", "Grape");

        int position = 2;

        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position");
        } else {
            list.addAll(position, elementsToInsert);

            System.out.println("LinkedList after insertion: " + list);
        }
    }
}