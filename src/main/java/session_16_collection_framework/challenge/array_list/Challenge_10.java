package session_16_collection_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge_10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("ArrayList before shuffling: " + list);

        Collections.shuffle(list);

        System.out.println("ArrayList after shuffling: " + list);
    }
}