package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.Iterator;

public class Challenge_4 {


    public static void main(String[] args) {
        // Create a LinkedList and add elements to it
        LinkedList<String> list = new LinkedList<>();
        list.add("5");
        list.add("10");
        list.add("27");
        list.add("53");
        list.add("29");
        list.add("77");

        System.out.println("Iterating in reverse order using descendingIterator():");
        Iterator<String> reverseIterator = list.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        System.out.println("\nIterating in reverse order using for loop with get(index):");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        System.out.println("\nIterating in reverse order using Java 8 streams:");
        list.stream()
                .sorted((s1, s2) -> -1)
                .forEach(System.out::println);
    }
}