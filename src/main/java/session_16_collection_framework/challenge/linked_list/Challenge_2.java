package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.Iterator;

public class Challenge_2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Iterating using for-each loop:");
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("\nIterating using iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIterating using for loop with get(index):");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nIterating using Java 8 forEach and lambda:");
        list.forEach(element -> {
            System.out.println(element);
        });
    }
}