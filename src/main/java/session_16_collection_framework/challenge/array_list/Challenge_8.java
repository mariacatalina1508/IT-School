package session_16_collection_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge_8 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(45);

        System.out.println("ArrayList before sorting: " + list);

        Collections.sort(list);

        System.out.println("ArrayList after sorting: " + list);
    }
}