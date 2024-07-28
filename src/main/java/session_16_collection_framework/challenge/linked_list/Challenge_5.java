package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge_5 {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Pear");
        list.add("Mango");

        System.out.println("Original LinkedList: " + list);

        String elementToInsert = "Elderberry";
        int position = 4;

        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position");
        } else {
            list.add(position, elementToInsert);

            System.out.println("LinkedList after insertion: " + list);
        }
    }
}